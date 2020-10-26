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

@Tag("5")
class Record_3244 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3244: FirstName is Maryanne")
	void FirstNameOfRecord3244() {
		assertEquals("Maryanne", customers.get(3243).getFirstName());
	}

	@Test
	@DisplayName("Record 3244: LastName is Misik")
	void LastNameOfRecord3244() {
		assertEquals("Misik", customers.get(3243).getLastName());
	}

	@Test
	@DisplayName("Record 3244: Company is Busek, Charles T")
	void CompanyOfRecord3244() {
		assertEquals("Busek, Charles T", customers.get(3243).getCompany());
	}

	@Test
	@DisplayName("Record 3244: Address is 120 East Avenue N")
	void AddressOfRecord3244() {
		assertEquals("120 East Avenue N", customers.get(3243).getAddress());
	}

	@Test
	@DisplayName("Record 3244: City is Ketchum")
	void CityOfRecord3244() {
		assertEquals("Ketchum", customers.get(3243).getCity());
	}

	@Test
	@DisplayName("Record 3244: County is Blaine")
	void CountyOfRecord3244() {
		assertEquals("Blaine", customers.get(3243).getCounty());
	}

	@Test
	@DisplayName("Record 3244: State is ID")
	void StateOfRecord3244() {
		assertEquals("ID", customers.get(3243).getState());
	}

	@Test
	@DisplayName("Record 3244: ZIP is 83340")
	void ZIPOfRecord3244() {
		assertEquals("83340", customers.get(3243).getZIP());
	}

	@Test
	@DisplayName("Record 3244: Phone is 208-726-0377")
	void PhoneOfRecord3244() {
		assertEquals("208-726-0377", customers.get(3243).getPhone());
	}

	@Test
	@DisplayName("Record 3244: Fax is 208-726-7412")
	void FaxOfRecord3244() {
		assertEquals("208-726-7412", customers.get(3243).getFax());
	}

	@Test
	@DisplayName("Record 3244: Email is maryanne@misik.com")
	void EmailOfRecord3244() {
		assertEquals("maryanne@misik.com", customers.get(3243).getEmail());
	}

	@Test
	@DisplayName("Record 3244: Web is http://www.maryannemisik.com")
	void WebOfRecord3244() {
		assertEquals("http://www.maryannemisik.com", customers.get(3243).getWeb());
	}
}
