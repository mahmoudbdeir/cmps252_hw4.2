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
class Record_3948 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3948: FirstName is Harriet")
	void FirstNameOfRecord3948() {
		assertEquals("Harriet", customers.get(3947).getFirstName());
	}

	@Test
	@DisplayName("Record 3948: LastName is Mckahan")
	void LastNameOfRecord3948() {
		assertEquals("Mckahan", customers.get(3947).getLastName());
	}

	@Test
	@DisplayName("Record 3948: Company is Arthurs Rstrnt & Pub Ramada")
	void CompanyOfRecord3948() {
		assertEquals("Arthurs Rstrnt & Pub Ramada", customers.get(3947).getCompany());
	}

	@Test
	@DisplayName("Record 3948: Address is 508 Moccasin Dr")
	void AddressOfRecord3948() {
		assertEquals("508 Moccasin Dr", customers.get(3947).getAddress());
	}

	@Test
	@DisplayName("Record 3948: City is Aberdeen")
	void CityOfRecord3948() {
		assertEquals("Aberdeen", customers.get(3947).getCity());
	}

	@Test
	@DisplayName("Record 3948: County is Brown")
	void CountyOfRecord3948() {
		assertEquals("Brown", customers.get(3947).getCounty());
	}

	@Test
	@DisplayName("Record 3948: State is SD")
	void StateOfRecord3948() {
		assertEquals("SD", customers.get(3947).getState());
	}

	@Test
	@DisplayName("Record 3948: ZIP is 57401")
	void ZIPOfRecord3948() {
		assertEquals("57401", customers.get(3947).getZIP());
	}

	@Test
	@DisplayName("Record 3948: Phone is 605-225-6422")
	void PhoneOfRecord3948() {
		assertEquals("605-225-6422", customers.get(3947).getPhone());
	}

	@Test
	@DisplayName("Record 3948: Fax is 605-225-5047")
	void FaxOfRecord3948() {
		assertEquals("605-225-5047", customers.get(3947).getFax());
	}

	@Test
	@DisplayName("Record 3948: Email is harriet@mckahan.com")
	void EmailOfRecord3948() {
		assertEquals("harriet@mckahan.com", customers.get(3947).getEmail());
	}

	@Test
	@DisplayName("Record 3948: Web is http://www.harrietmckahan.com")
	void WebOfRecord3948() {
		assertEquals("http://www.harrietmckahan.com", customers.get(3947).getWeb());
	}
}
