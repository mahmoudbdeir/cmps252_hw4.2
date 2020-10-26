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

@Tag("8")
class Record_2756 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2756: FirstName is Ashlygh")
	void FirstNameOfRecord2756() {
		assertEquals("Ashlygh", customers.get(2755).getFirstName());
	}

	@Test
	@DisplayName("Record 2756: LastName is Kunselman")
	void LastNameOfRecord2756() {
		assertEquals("Kunselman", customers.get(2755).getLastName());
	}

	@Test
	@DisplayName("Record 2756: Company is Lee, Kee C Md")
	void CompanyOfRecord2756() {
		assertEquals("Lee, Kee C Md", customers.get(2755).getCompany());
	}

	@Test
	@DisplayName("Record 2756: Address is 6625 8th Ave")
	void AddressOfRecord2756() {
		assertEquals("6625 8th Ave", customers.get(2755).getAddress());
	}

	@Test
	@DisplayName("Record 2756: City is Los Angeles")
	void CityOfRecord2756() {
		assertEquals("Los Angeles", customers.get(2755).getCity());
	}

	@Test
	@DisplayName("Record 2756: County is Los Angeles")
	void CountyOfRecord2756() {
		assertEquals("Los Angeles", customers.get(2755).getCounty());
	}

	@Test
	@DisplayName("Record 2756: State is CA")
	void StateOfRecord2756() {
		assertEquals("CA", customers.get(2755).getState());
	}

	@Test
	@DisplayName("Record 2756: ZIP is 90043")
	void ZIPOfRecord2756() {
		assertEquals("90043", customers.get(2755).getZIP());
	}

	@Test
	@DisplayName("Record 2756: Phone is 323-750-2505")
	void PhoneOfRecord2756() {
		assertEquals("323-750-2505", customers.get(2755).getPhone());
	}

	@Test
	@DisplayName("Record 2756: Fax is 323-750-7564")
	void FaxOfRecord2756() {
		assertEquals("323-750-7564", customers.get(2755).getFax());
	}

	@Test
	@DisplayName("Record 2756: Email is ashlygh@kunselman.com")
	void EmailOfRecord2756() {
		assertEquals("ashlygh@kunselman.com", customers.get(2755).getEmail());
	}

	@Test
	@DisplayName("Record 2756: Web is http://www.ashlyghkunselman.com")
	void WebOfRecord2756() {
		assertEquals("http://www.ashlyghkunselman.com", customers.get(2755).getWeb());
	}
}
