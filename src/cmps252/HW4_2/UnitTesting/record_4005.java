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

@Tag("36")
class Record_4005 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4005: FirstName is Merle")
	void FirstNameOfRecord4005() {
		assertEquals("Merle", customers.get(4004).getFirstName());
	}

	@Test
	@DisplayName("Record 4005: LastName is Mesker")
	void LastNameOfRecord4005() {
		assertEquals("Mesker", customers.get(4004).getLastName());
	}

	@Test
	@DisplayName("Record 4005: Company is Kaab Kwoz")
	void CompanyOfRecord4005() {
		assertEquals("Kaab Kwoz", customers.get(4004).getCompany());
	}

	@Test
	@DisplayName("Record 4005: Address is 5500 W Kellogg Dr")
	void AddressOfRecord4005() {
		assertEquals("5500 W Kellogg Dr", customers.get(4004).getAddress());
	}

	@Test
	@DisplayName("Record 4005: City is Wichita")
	void CityOfRecord4005() {
		assertEquals("Wichita", customers.get(4004).getCity());
	}

	@Test
	@DisplayName("Record 4005: County is Sedgwick")
	void CountyOfRecord4005() {
		assertEquals("Sedgwick", customers.get(4004).getCounty());
	}

	@Test
	@DisplayName("Record 4005: State is KS")
	void StateOfRecord4005() {
		assertEquals("KS", customers.get(4004).getState());
	}

	@Test
	@DisplayName("Record 4005: ZIP is 67209")
	void ZIPOfRecord4005() {
		assertEquals("67209", customers.get(4004).getZIP());
	}

	@Test
	@DisplayName("Record 4005: Phone is 316-943-3694")
	void PhoneOfRecord4005() {
		assertEquals("316-943-3694", customers.get(4004).getPhone());
	}

	@Test
	@DisplayName("Record 4005: Fax is 316-943-2945")
	void FaxOfRecord4005() {
		assertEquals("316-943-2945", customers.get(4004).getFax());
	}

	@Test
	@DisplayName("Record 4005: Email is merle@mesker.com")
	void EmailOfRecord4005() {
		assertEquals("merle@mesker.com", customers.get(4004).getEmail());
	}

	@Test
	@DisplayName("Record 4005: Web is http://www.merlemesker.com")
	void WebOfRecord4005() {
		assertEquals("http://www.merlemesker.com", customers.get(4004).getWeb());
	}
}
