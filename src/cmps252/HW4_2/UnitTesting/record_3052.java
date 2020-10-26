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

@Tag("24")
class Record_3052 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3052: FirstName is Blanche")
	void FirstNameOfRecord3052() {
		assertEquals("Blanche", customers.get(3051).getFirstName());
	}

	@Test
	@DisplayName("Record 3052: LastName is Mimaki")
	void LastNameOfRecord3052() {
		assertEquals("Mimaki", customers.get(3051).getLastName());
	}

	@Test
	@DisplayName("Record 3052: Company is United States Cabinetry")
	void CompanyOfRecord3052() {
		assertEquals("United States Cabinetry", customers.get(3051).getCompany());
	}

	@Test
	@DisplayName("Record 3052: Address is 611 E Central Ave")
	void AddressOfRecord3052() {
		assertEquals("611 E Central Ave", customers.get(3051).getAddress());
	}

	@Test
	@DisplayName("Record 3052: City is Wichita")
	void CityOfRecord3052() {
		assertEquals("Wichita", customers.get(3051).getCity());
	}

	@Test
	@DisplayName("Record 3052: County is Sedgwick")
	void CountyOfRecord3052() {
		assertEquals("Sedgwick", customers.get(3051).getCounty());
	}

	@Test
	@DisplayName("Record 3052: State is KS")
	void StateOfRecord3052() {
		assertEquals("KS", customers.get(3051).getState());
	}

	@Test
	@DisplayName("Record 3052: ZIP is 67202")
	void ZIPOfRecord3052() {
		assertEquals("67202", customers.get(3051).getZIP());
	}

	@Test
	@DisplayName("Record 3052: Phone is 316-265-0144")
	void PhoneOfRecord3052() {
		assertEquals("316-265-0144", customers.get(3051).getPhone());
	}

	@Test
	@DisplayName("Record 3052: Fax is 316-265-1778")
	void FaxOfRecord3052() {
		assertEquals("316-265-1778", customers.get(3051).getFax());
	}

	@Test
	@DisplayName("Record 3052: Email is blanche@mimaki.com")
	void EmailOfRecord3052() {
		assertEquals("blanche@mimaki.com", customers.get(3051).getEmail());
	}

	@Test
	@DisplayName("Record 3052: Web is http://www.blanchemimaki.com")
	void WebOfRecord3052() {
		assertEquals("http://www.blanchemimaki.com", customers.get(3051).getWeb());
	}
}
