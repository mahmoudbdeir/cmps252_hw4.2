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

@Tag("33")
class Record_4808 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4808: FirstName is Harrison")
	void FirstNameOfRecord4808() {
		assertEquals("Harrison", customers.get(4807).getFirstName());
	}

	@Test
	@DisplayName("Record 4808: LastName is Neel")
	void LastNameOfRecord4808() {
		assertEquals("Neel", customers.get(4807).getLastName());
	}

	@Test
	@DisplayName("Record 4808: Company is Mcbride, C Kathleen Esq")
	void CompanyOfRecord4808() {
		assertEquals("Mcbride, C Kathleen Esq", customers.get(4807).getCompany());
	}

	@Test
	@DisplayName("Record 4808: Address is 1070 W Main St")
	void AddressOfRecord4808() {
		assertEquals("1070 W Main St", customers.get(4807).getAddress());
	}

	@Test
	@DisplayName("Record 4808: City is Stroudsburg")
	void CityOfRecord4808() {
		assertEquals("Stroudsburg", customers.get(4807).getCity());
	}

	@Test
	@DisplayName("Record 4808: County is Monroe")
	void CountyOfRecord4808() {
		assertEquals("Monroe", customers.get(4807).getCounty());
	}

	@Test
	@DisplayName("Record 4808: State is PA")
	void StateOfRecord4808() {
		assertEquals("PA", customers.get(4807).getState());
	}

	@Test
	@DisplayName("Record 4808: ZIP is 18360")
	void ZIPOfRecord4808() {
		assertEquals("18360", customers.get(4807).getZIP());
	}

	@Test
	@DisplayName("Record 4808: Phone is 570-424-8272")
	void PhoneOfRecord4808() {
		assertEquals("570-424-8272", customers.get(4807).getPhone());
	}

	@Test
	@DisplayName("Record 4808: Fax is 570-424-0184")
	void FaxOfRecord4808() {
		assertEquals("570-424-0184", customers.get(4807).getFax());
	}

	@Test
	@DisplayName("Record 4808: Email is harrison@neel.com")
	void EmailOfRecord4808() {
		assertEquals("harrison@neel.com", customers.get(4807).getEmail());
	}

	@Test
	@DisplayName("Record 4808: Web is http://www.harrisonneel.com")
	void WebOfRecord4808() {
		assertEquals("http://www.harrisonneel.com", customers.get(4807).getWeb());
	}
}
