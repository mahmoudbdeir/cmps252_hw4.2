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

@Tag("20")
class Record_1381 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1381: FirstName is Emory")
	void FirstNameOfRecord1381() {
		assertEquals("Emory", customers.get(1380).getFirstName());
	}

	@Test
	@DisplayName("Record 1381: LastName is Gumprecht")
	void LastNameOfRecord1381() {
		assertEquals("Gumprecht", customers.get(1380).getLastName());
	}

	@Test
	@DisplayName("Record 1381: Company is Hickory Stucco & Wall Systems")
	void CompanyOfRecord1381() {
		assertEquals("Hickory Stucco & Wall Systems", customers.get(1380).getCompany());
	}

	@Test
	@DisplayName("Record 1381: Address is 205 Hazel St")
	void AddressOfRecord1381() {
		assertEquals("205 Hazel St", customers.get(1380).getAddress());
	}

	@Test
	@DisplayName("Record 1381: City is Lancaster")
	void CityOfRecord1381() {
		assertEquals("Lancaster", customers.get(1380).getCity());
	}

	@Test
	@DisplayName("Record 1381: County is Lancaster")
	void CountyOfRecord1381() {
		assertEquals("Lancaster", customers.get(1380).getCounty());
	}

	@Test
	@DisplayName("Record 1381: State is PA")
	void StateOfRecord1381() {
		assertEquals("PA", customers.get(1380).getState());
	}

	@Test
	@DisplayName("Record 1381: ZIP is 17603")
	void ZIPOfRecord1381() {
		assertEquals("17603", customers.get(1380).getZIP());
	}

	@Test
	@DisplayName("Record 1381: Phone is 717-393-1185")
	void PhoneOfRecord1381() {
		assertEquals("717-393-1185", customers.get(1380).getPhone());
	}

	@Test
	@DisplayName("Record 1381: Fax is 717-393-5149")
	void FaxOfRecord1381() {
		assertEquals("717-393-5149", customers.get(1380).getFax());
	}

	@Test
	@DisplayName("Record 1381: Email is emory@gumprecht.com")
	void EmailOfRecord1381() {
		assertEquals("emory@gumprecht.com", customers.get(1380).getEmail());
	}

	@Test
	@DisplayName("Record 1381: Web is http://www.emorygumprecht.com")
	void WebOfRecord1381() {
		assertEquals("http://www.emorygumprecht.com", customers.get(1380).getWeb());
	}
}
