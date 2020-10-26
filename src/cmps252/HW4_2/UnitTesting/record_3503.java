package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("41")
class Record_3503 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3503: FirstName is Verda")
	void FirstNameOfRecord3503() {
		assertEquals("Verda", customers.get(3502).getFirstName());
	}

	@Test
	@DisplayName("Record 3503: LastName is Mcclenic")
	void LastNameOfRecord3503() {
		assertEquals("Mcclenic", customers.get(3502).getLastName());
	}

	@Test
	@DisplayName("Record 3503: Company is White Star Packing Corp")
	void CompanyOfRecord3503() {
		assertEquals("White Star Packing Corp", customers.get(3502).getCompany());
	}

	@Test
	@DisplayName("Record 3503: Address is Bicntnl")
	void AddressOfRecord3503() {
		assertEquals("Bicntnl", customers.get(3502).getAddress());
	}

	@Test
	@DisplayName("Record 3503: City is Wilkes Barre")
	void CityOfRecord3503() {
		assertEquals("Wilkes Barre", customers.get(3502).getCity());
	}

	@Test
	@DisplayName("Record 3503: County is Luzerne")
	void CountyOfRecord3503() {
		assertEquals("Luzerne", customers.get(3502).getCounty());
	}

	@Test
	@DisplayName("Record 3503: State is PA")
	void StateOfRecord3503() {
		assertEquals("PA", customers.get(3502).getState());
	}

	@Test
	@DisplayName("Record 3503: ZIP is 18701")
	void ZIPOfRecord3503() {
		assertEquals("18701", customers.get(3502).getZIP());
	}

	@Test
	@DisplayName("Record 3503: Phone is 570-825-4059")
	void PhoneOfRecord3503() {
		assertEquals("570-825-4059", customers.get(3502).getPhone());
	}

	@Test
	@DisplayName("Record 3503: Fax is 570-825-4695")
	void FaxOfRecord3503() {
		assertEquals("570-825-4695", customers.get(3502).getFax());
	}

	@Test
	@DisplayName("Record 3503: Email is verda@mcclenic.com")
	void EmailOfRecord3503() {
		assertEquals("verda@mcclenic.com", customers.get(3502).getEmail());
	}

	@Test
	@DisplayName("Record 3503: Web is http://www.verdamcclenic.com")
	void WebOfRecord3503() {
		assertEquals("http://www.verdamcclenic.com", customers.get(3502).getWeb());
	}
}
