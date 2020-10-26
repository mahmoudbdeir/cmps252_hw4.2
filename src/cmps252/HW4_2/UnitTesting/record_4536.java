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

@Tag("34")
class Record_4536 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4536: FirstName is Trent")
	void FirstNameOfRecord4536() {
		assertEquals("Trent", customers.get(4535).getFirstName());
	}

	@Test
	@DisplayName("Record 4536: LastName is Breutsmann")
	void LastNameOfRecord4536() {
		assertEquals("Breutsmann", customers.get(4535).getLastName());
	}

	@Test
	@DisplayName("Record 4536: Company is Truck Service Center")
	void CompanyOfRecord4536() {
		assertEquals("Truck Service Center", customers.get(4535).getCompany());
	}

	@Test
	@DisplayName("Record 4536: Address is 5420 Vineland Ave")
	void AddressOfRecord4536() {
		assertEquals("5420 Vineland Ave", customers.get(4535).getAddress());
	}

	@Test
	@DisplayName("Record 4536: City is North Hollywood")
	void CityOfRecord4536() {
		assertEquals("North Hollywood", customers.get(4535).getCity());
	}

	@Test
	@DisplayName("Record 4536: County is Los Angeles")
	void CountyOfRecord4536() {
		assertEquals("Los Angeles", customers.get(4535).getCounty());
	}

	@Test
	@DisplayName("Record 4536: State is CA")
	void StateOfRecord4536() {
		assertEquals("CA", customers.get(4535).getState());
	}

	@Test
	@DisplayName("Record 4536: ZIP is 91601")
	void ZIPOfRecord4536() {
		assertEquals("91601", customers.get(4535).getZIP());
	}

	@Test
	@DisplayName("Record 4536: Phone is 818-766-8361")
	void PhoneOfRecord4536() {
		assertEquals("818-766-8361", customers.get(4535).getPhone());
	}

	@Test
	@DisplayName("Record 4536: Fax is 818-766-7836")
	void FaxOfRecord4536() {
		assertEquals("818-766-7836", customers.get(4535).getFax());
	}

	@Test
	@DisplayName("Record 4536: Email is trent@breutsmann.com")
	void EmailOfRecord4536() {
		assertEquals("trent@breutsmann.com", customers.get(4535).getEmail());
	}

	@Test
	@DisplayName("Record 4536: Web is http://www.trentbreutsmann.com")
	void WebOfRecord4536() {
		assertEquals("http://www.trentbreutsmann.com", customers.get(4535).getWeb());
	}
}
