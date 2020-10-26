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

@Tag("28")
class Record_81 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 81: FirstName is Michelle")
	void FirstNameOfRecord81() {
		assertEquals("Michelle", customers.get(80).getFirstName());
	}

	@Test
	@DisplayName("Record 81: LastName is Shmidt")
	void LastNameOfRecord81() {
		assertEquals("Shmidt", customers.get(80).getLastName());
	}

	@Test
	@DisplayName("Record 81: Company is Cornnuts Inc")
	void CompanyOfRecord81() {
		assertEquals("Cornnuts Inc", customers.get(80).getCompany());
	}

	@Test
	@DisplayName("Record 81: Address is 5392 Hwy 150 E")
	void AddressOfRecord81() {
		assertEquals("5392 Hwy 150 E", customers.get(80).getAddress());
	}

	@Test
	@DisplayName("Record 81: City is Browns Summit")
	void CityOfRecord81() {
		assertEquals("Browns Summit", customers.get(80).getCity());
	}

	@Test
	@DisplayName("Record 81: County is Guilford")
	void CountyOfRecord81() {
		assertEquals("Guilford", customers.get(80).getCounty());
	}

	@Test
	@DisplayName("Record 81: State is NC")
	void StateOfRecord81() {
		assertEquals("NC", customers.get(80).getState());
	}

	@Test
	@DisplayName("Record 81: ZIP is 27214")
	void ZIPOfRecord81() {
		assertEquals("27214", customers.get(80).getZIP());
	}

	@Test
	@DisplayName("Record 81: Phone is 336-656-4434")
	void PhoneOfRecord81() {
		assertEquals("336-656-4434", customers.get(80).getPhone());
	}

	@Test
	@DisplayName("Record 81: Fax is 336-656-1089")
	void FaxOfRecord81() {
		assertEquals("336-656-1089", customers.get(80).getFax());
	}

	@Test
	@DisplayName("Record 81: Email is michelle@shmidt.com")
	void EmailOfRecord81() {
		assertEquals("michelle@shmidt.com", customers.get(80).getEmail());
	}

	@Test
	@DisplayName("Record 81: Web is http://www.michelleshmidt.com")
	void WebOfRecord81() {
		assertEquals("http://www.michelleshmidt.com", customers.get(80).getWeb());
	}
}
