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

@Tag("12")
class Record_1553 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1553: FirstName is Francisca")
	void FirstNameOfRecord1553() {
		assertEquals("Francisca", customers.get(1552).getFirstName());
	}

	@Test
	@DisplayName("Record 1553: LastName is Hytner")
	void LastNameOfRecord1553() {
		assertEquals("Hytner", customers.get(1552).getLastName());
	}

	@Test
	@DisplayName("Record 1553: Company is Mcgarec Machine")
	void CompanyOfRecord1553() {
		assertEquals("Mcgarec Machine", customers.get(1552).getCompany());
	}

	@Test
	@DisplayName("Record 1553: Address is 1965 Lycoming Creek Rd")
	void AddressOfRecord1553() {
		assertEquals("1965 Lycoming Creek Rd", customers.get(1552).getAddress());
	}

	@Test
	@DisplayName("Record 1553: City is Williamsport")
	void CityOfRecord1553() {
		assertEquals("Williamsport", customers.get(1552).getCity());
	}

	@Test
	@DisplayName("Record 1553: County is Lycoming")
	void CountyOfRecord1553() {
		assertEquals("Lycoming", customers.get(1552).getCounty());
	}

	@Test
	@DisplayName("Record 1553: State is PA")
	void StateOfRecord1553() {
		assertEquals("PA", customers.get(1552).getState());
	}

	@Test
	@DisplayName("Record 1553: ZIP is 17701")
	void ZIPOfRecord1553() {
		assertEquals("17701", customers.get(1552).getZIP());
	}

	@Test
	@DisplayName("Record 1553: Phone is 570-322-9606")
	void PhoneOfRecord1553() {
		assertEquals("570-322-9606", customers.get(1552).getPhone());
	}

	@Test
	@DisplayName("Record 1553: Fax is 570-322-0016")
	void FaxOfRecord1553() {
		assertEquals("570-322-0016", customers.get(1552).getFax());
	}

	@Test
	@DisplayName("Record 1553: Email is francisca@hytner.com")
	void EmailOfRecord1553() {
		assertEquals("francisca@hytner.com", customers.get(1552).getEmail());
	}

	@Test
	@DisplayName("Record 1553: Web is http://www.franciscahytner.com")
	void WebOfRecord1553() {
		assertEquals("http://www.franciscahytner.com", customers.get(1552).getWeb());
	}
}
