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
class Record_2820 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2820: FirstName is Marguerite")
	void FirstNameOfRecord2820() {
		assertEquals("Marguerite", customers.get(2819).getFirstName());
	}

	@Test
	@DisplayName("Record 2820: LastName is Steadham")
	void LastNameOfRecord2820() {
		assertEquals("Steadham", customers.get(2819).getLastName());
	}

	@Test
	@DisplayName("Record 2820: Company is Phillips & Galanter Pc")
	void CompanyOfRecord2820() {
		assertEquals("Phillips & Galanter Pc", customers.get(2819).getCompany());
	}

	@Test
	@DisplayName("Record 2820: Address is 2820 Se 39th Loop")
	void AddressOfRecord2820() {
		assertEquals("2820 Se 39th Loop", customers.get(2819).getAddress());
	}

	@Test
	@DisplayName("Record 2820: City is Hillsboro")
	void CityOfRecord2820() {
		assertEquals("Hillsboro", customers.get(2819).getCity());
	}

	@Test
	@DisplayName("Record 2820: County is Washington")
	void CountyOfRecord2820() {
		assertEquals("Washington", customers.get(2819).getCounty());
	}

	@Test
	@DisplayName("Record 2820: State is OR")
	void StateOfRecord2820() {
		assertEquals("OR", customers.get(2819).getState());
	}

	@Test
	@DisplayName("Record 2820: ZIP is 97123")
	void ZIPOfRecord2820() {
		assertEquals("97123", customers.get(2819).getZIP());
	}

	@Test
	@DisplayName("Record 2820: Phone is 503-640-0119")
	void PhoneOfRecord2820() {
		assertEquals("503-640-0119", customers.get(2819).getPhone());
	}

	@Test
	@DisplayName("Record 2820: Fax is 503-640-3763")
	void FaxOfRecord2820() {
		assertEquals("503-640-3763", customers.get(2819).getFax());
	}

	@Test
	@DisplayName("Record 2820: Email is marguerite@steadham.com")
	void EmailOfRecord2820() {
		assertEquals("marguerite@steadham.com", customers.get(2819).getEmail());
	}

	@Test
	@DisplayName("Record 2820: Web is http://www.margueritesteadham.com")
	void WebOfRecord2820() {
		assertEquals("http://www.margueritesteadham.com", customers.get(2819).getWeb());
	}
}
