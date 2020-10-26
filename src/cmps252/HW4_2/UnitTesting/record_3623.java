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

@Tag("35")
class Record_3623 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3623: FirstName is Joanne")
	void FirstNameOfRecord3623() {
		assertEquals("Joanne", customers.get(3622).getFirstName());
	}

	@Test
	@DisplayName("Record 3623: LastName is Granillo")
	void LastNameOfRecord3623() {
		assertEquals("Granillo", customers.get(3622).getLastName());
	}

	@Test
	@DisplayName("Record 3623: Company is Budget Construction")
	void CompanyOfRecord3623() {
		assertEquals("Budget Construction", customers.get(3622).getCompany());
	}

	@Test
	@DisplayName("Record 3623: Address is 201 Robert S")
	void AddressOfRecord3623() {
		assertEquals("201 Robert S", customers.get(3622).getAddress());
	}

	@Test
	@DisplayName("Record 3623: City is Oklahoma City")
	void CityOfRecord3623() {
		assertEquals("Oklahoma City", customers.get(3622).getCity());
	}

	@Test
	@DisplayName("Record 3623: County is Oklahoma")
	void CountyOfRecord3623() {
		assertEquals("Oklahoma", customers.get(3622).getCounty());
	}

	@Test
	@DisplayName("Record 3623: State is OK")
	void StateOfRecord3623() {
		assertEquals("OK", customers.get(3622).getState());
	}

	@Test
	@DisplayName("Record 3623: ZIP is 73102")
	void ZIPOfRecord3623() {
		assertEquals("73102", customers.get(3622).getZIP());
	}

	@Test
	@DisplayName("Record 3623: Phone is 405-232-6084")
	void PhoneOfRecord3623() {
		assertEquals("405-232-6084", customers.get(3622).getPhone());
	}

	@Test
	@DisplayName("Record 3623: Fax is 405-232-9865")
	void FaxOfRecord3623() {
		assertEquals("405-232-9865", customers.get(3622).getFax());
	}

	@Test
	@DisplayName("Record 3623: Email is joanne@granillo.com")
	void EmailOfRecord3623() {
		assertEquals("joanne@granillo.com", customers.get(3622).getEmail());
	}

	@Test
	@DisplayName("Record 3623: Web is http://www.joannegranillo.com")
	void WebOfRecord3623() {
		assertEquals("http://www.joannegranillo.com", customers.get(3622).getWeb());
	}
}
