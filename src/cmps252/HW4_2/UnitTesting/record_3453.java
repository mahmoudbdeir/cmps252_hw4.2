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

@Tag("20")
class Record_3453 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3453: FirstName is Taryn")
	void FirstNameOfRecord3453() {
		assertEquals("Taryn", customers.get(3452).getFirstName());
	}

	@Test
	@DisplayName("Record 3453: LastName is Hartwig")
	void LastNameOfRecord3453() {
		assertEquals("Hartwig", customers.get(3452).getLastName());
	}

	@Test
	@DisplayName("Record 3453: Company is Griffin & Laser")
	void CompanyOfRecord3453() {
		assertEquals("Griffin & Laser", customers.get(3452).getCompany());
	}

	@Test
	@DisplayName("Record 3453: Address is 92 Mantoloking Rd")
	void AddressOfRecord3453() {
		assertEquals("92 Mantoloking Rd", customers.get(3452).getAddress());
	}

	@Test
	@DisplayName("Record 3453: City is Brick")
	void CityOfRecord3453() {
		assertEquals("Brick", customers.get(3452).getCity());
	}

	@Test
	@DisplayName("Record 3453: County is Ocean")
	void CountyOfRecord3453() {
		assertEquals("Ocean", customers.get(3452).getCounty());
	}

	@Test
	@DisplayName("Record 3453: State is NJ")
	void StateOfRecord3453() {
		assertEquals("NJ", customers.get(3452).getState());
	}

	@Test
	@DisplayName("Record 3453: ZIP is 8723")
	void ZIPOfRecord3453() {
		assertEquals("8723", customers.get(3452).getZIP());
	}

	@Test
	@DisplayName("Record 3453: Phone is 732-477-2075")
	void PhoneOfRecord3453() {
		assertEquals("732-477-2075", customers.get(3452).getPhone());
	}

	@Test
	@DisplayName("Record 3453: Fax is 732-477-0726")
	void FaxOfRecord3453() {
		assertEquals("732-477-0726", customers.get(3452).getFax());
	}

	@Test
	@DisplayName("Record 3453: Email is taryn@hartwig.com")
	void EmailOfRecord3453() {
		assertEquals("taryn@hartwig.com", customers.get(3452).getEmail());
	}

	@Test
	@DisplayName("Record 3453: Web is http://www.tarynhartwig.com")
	void WebOfRecord3453() {
		assertEquals("http://www.tarynhartwig.com", customers.get(3452).getWeb());
	}
}
