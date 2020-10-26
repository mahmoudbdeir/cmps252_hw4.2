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
class Record_3739 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3739: FirstName is June")
	void FirstNameOfRecord3739() {
		assertEquals("June", customers.get(3738).getFirstName());
	}

	@Test
	@DisplayName("Record 3739: LastName is Jessee")
	void LastNameOfRecord3739() {
		assertEquals("Jessee", customers.get(3738).getLastName());
	}

	@Test
	@DisplayName("Record 3739: Company is Holiday Inn")
	void CompanyOfRecord3739() {
		assertEquals("Holiday Inn", customers.get(3738).getCompany());
	}

	@Test
	@DisplayName("Record 3739: Address is 3001 E Highland Rd")
	void AddressOfRecord3739() {
		assertEquals("3001 E Highland Rd", customers.get(3738).getAddress());
	}

	@Test
	@DisplayName("Record 3739: City is Highland")
	void CityOfRecord3739() {
		assertEquals("Highland", customers.get(3738).getCity());
	}

	@Test
	@DisplayName("Record 3739: County is Oakland")
	void CountyOfRecord3739() {
		assertEquals("Oakland", customers.get(3738).getCounty());
	}

	@Test
	@DisplayName("Record 3739: State is MI")
	void StateOfRecord3739() {
		assertEquals("MI", customers.get(3738).getState());
	}

	@Test
	@DisplayName("Record 3739: ZIP is 48356")
	void ZIPOfRecord3739() {
		assertEquals("48356", customers.get(3738).getZIP());
	}

	@Test
	@DisplayName("Record 3739: Phone is 248-889-0319")
	void PhoneOfRecord3739() {
		assertEquals("248-889-0319", customers.get(3738).getPhone());
	}

	@Test
	@DisplayName("Record 3739: Fax is 248-889-3445")
	void FaxOfRecord3739() {
		assertEquals("248-889-3445", customers.get(3738).getFax());
	}

	@Test
	@DisplayName("Record 3739: Email is june@jessee.com")
	void EmailOfRecord3739() {
		assertEquals("june@jessee.com", customers.get(3738).getEmail());
	}

	@Test
	@DisplayName("Record 3739: Web is http://www.junejessee.com")
	void WebOfRecord3739() {
		assertEquals("http://www.junejessee.com", customers.get(3738).getWeb());
	}
}
