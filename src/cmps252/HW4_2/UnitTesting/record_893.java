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

@Tag("39")
class Record_893 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 893: FirstName is Emilio")
	void FirstNameOfRecord893() {
		assertEquals("Emilio", customers.get(892).getFirstName());
	}

	@Test
	@DisplayName("Record 893: LastName is Mikita")
	void LastNameOfRecord893() {
		assertEquals("Mikita", customers.get(892).getLastName());
	}

	@Test
	@DisplayName("Record 893: Company is M N M Quality Printing")
	void CompanyOfRecord893() {
		assertEquals("M N M Quality Printing", customers.get(892).getCompany());
	}

	@Test
	@DisplayName("Record 893: Address is 543 Tarrytown Rd")
	void AddressOfRecord893() {
		assertEquals("543 Tarrytown Rd", customers.get(892).getAddress());
	}

	@Test
	@DisplayName("Record 893: City is White Plains")
	void CityOfRecord893() {
		assertEquals("White Plains", customers.get(892).getCity());
	}

	@Test
	@DisplayName("Record 893: County is Westchester")
	void CountyOfRecord893() {
		assertEquals("Westchester", customers.get(892).getCounty());
	}

	@Test
	@DisplayName("Record 893: State is NY")
	void StateOfRecord893() {
		assertEquals("NY", customers.get(892).getState());
	}

	@Test
	@DisplayName("Record 893: ZIP is 10607")
	void ZIPOfRecord893() {
		assertEquals("10607", customers.get(892).getZIP());
	}

	@Test
	@DisplayName("Record 893: Phone is 914-683-6122")
	void PhoneOfRecord893() {
		assertEquals("914-683-6122", customers.get(892).getPhone());
	}

	@Test
	@DisplayName("Record 893: Fax is 914-683-2875")
	void FaxOfRecord893() {
		assertEquals("914-683-2875", customers.get(892).getFax());
	}

	@Test
	@DisplayName("Record 893: Email is emilio@mikita.com")
	void EmailOfRecord893() {
		assertEquals("emilio@mikita.com", customers.get(892).getEmail());
	}

	@Test
	@DisplayName("Record 893: Web is http://www.emiliomikita.com")
	void WebOfRecord893() {
		assertEquals("http://www.emiliomikita.com", customers.get(892).getWeb());
	}
}
