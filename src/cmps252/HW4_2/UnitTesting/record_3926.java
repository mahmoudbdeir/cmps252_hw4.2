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

@Tag("47")
class Record_3926 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3926: FirstName is Mellissa")
	void FirstNameOfRecord3926() {
		assertEquals("Mellissa", customers.get(3925).getFirstName());
	}

	@Test
	@DisplayName("Record 3926: LastName is Cohran")
	void LastNameOfRecord3926() {
		assertEquals("Cohran", customers.get(3925).getLastName());
	}

	@Test
	@DisplayName("Record 3926: Company is Hood Sailmakers")
	void CompanyOfRecord3926() {
		assertEquals("Hood Sailmakers", customers.get(3925).getCompany());
	}

	@Test
	@DisplayName("Record 3926: Address is 2900 Maplewood Dr")
	void AddressOfRecord3926() {
		assertEquals("2900 Maplewood Dr", customers.get(3925).getAddress());
	}

	@Test
	@DisplayName("Record 3926: City is Sulphur")
	void CityOfRecord3926() {
		assertEquals("Sulphur", customers.get(3925).getCity());
	}

	@Test
	@DisplayName("Record 3926: County is Calcasieu")
	void CountyOfRecord3926() {
		assertEquals("Calcasieu", customers.get(3925).getCounty());
	}

	@Test
	@DisplayName("Record 3926: State is LA")
	void StateOfRecord3926() {
		assertEquals("LA", customers.get(3925).getState());
	}

	@Test
	@DisplayName("Record 3926: ZIP is 70663")
	void ZIPOfRecord3926() {
		assertEquals("70663", customers.get(3925).getZIP());
	}

	@Test
	@DisplayName("Record 3926: Phone is 337-474-2397")
	void PhoneOfRecord3926() {
		assertEquals("337-474-2397", customers.get(3925).getPhone());
	}

	@Test
	@DisplayName("Record 3926: Fax is 337-474-7672")
	void FaxOfRecord3926() {
		assertEquals("337-474-7672", customers.get(3925).getFax());
	}

	@Test
	@DisplayName("Record 3926: Email is mellissa@cohran.com")
	void EmailOfRecord3926() {
		assertEquals("mellissa@cohran.com", customers.get(3925).getEmail());
	}

	@Test
	@DisplayName("Record 3926: Web is http://www.mellissacohran.com")
	void WebOfRecord3926() {
		assertEquals("http://www.mellissacohran.com", customers.get(3925).getWeb());
	}
}
