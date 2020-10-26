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

@Tag("18")
class Record_1585 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1585: FirstName is Gabriel")
	void FirstNameOfRecord1585() {
		assertEquals("Gabriel", customers.get(1584).getFirstName());
	}

	@Test
	@DisplayName("Record 1585: LastName is Pesarchick")
	void LastNameOfRecord1585() {
		assertEquals("Pesarchick", customers.get(1584).getLastName());
	}

	@Test
	@DisplayName("Record 1585: Company is Twin Ports Flying Service")
	void CompanyOfRecord1585() {
		assertEquals("Twin Ports Flying Service", customers.get(1584).getCompany());
	}

	@Test
	@DisplayName("Record 1585: Address is 331 W Broad St")
	void AddressOfRecord1585() {
		assertEquals("331 W Broad St", customers.get(1584).getAddress());
	}

	@Test
	@DisplayName("Record 1585: City is Palmyra")
	void CityOfRecord1585() {
		assertEquals("Palmyra", customers.get(1584).getCity());
	}

	@Test
	@DisplayName("Record 1585: County is Burlington")
	void CountyOfRecord1585() {
		assertEquals("Burlington", customers.get(1584).getCounty());
	}

	@Test
	@DisplayName("Record 1585: State is NJ")
	void StateOfRecord1585() {
		assertEquals("NJ", customers.get(1584).getState());
	}

	@Test
	@DisplayName("Record 1585: ZIP is 8065")
	void ZIPOfRecord1585() {
		assertEquals("8065", customers.get(1584).getZIP());
	}

	@Test
	@DisplayName("Record 1585: Phone is 856-829-8650")
	void PhoneOfRecord1585() {
		assertEquals("856-829-8650", customers.get(1584).getPhone());
	}

	@Test
	@DisplayName("Record 1585: Fax is 856-829-8066")
	void FaxOfRecord1585() {
		assertEquals("856-829-8066", customers.get(1584).getFax());
	}

	@Test
	@DisplayName("Record 1585: Email is gabriel@pesarchick.com")
	void EmailOfRecord1585() {
		assertEquals("gabriel@pesarchick.com", customers.get(1584).getEmail());
	}

	@Test
	@DisplayName("Record 1585: Web is http://www.gabrielpesarchick.com")
	void WebOfRecord1585() {
		assertEquals("http://www.gabrielpesarchick.com", customers.get(1584).getWeb());
	}
}
