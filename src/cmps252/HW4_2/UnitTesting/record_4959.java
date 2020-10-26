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

@Tag("14")
class Record_4959 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4959: FirstName is Rolf")
	void FirstNameOfRecord4959() {
		assertEquals("Rolf", customers.get(4958).getFirstName());
	}

	@Test
	@DisplayName("Record 4959: LastName is Wyssmann")
	void LastNameOfRecord4959() {
		assertEquals("Wyssmann", customers.get(4958).getLastName());
	}

	@Test
	@DisplayName("Record 4959: Company is C & H Financial Services")
	void CompanyOfRecord4959() {
		assertEquals("C & H Financial Services", customers.get(4958).getCompany());
	}

	@Test
	@DisplayName("Record 4959: Address is Highway 17")
	void AddressOfRecord4959() {
		assertEquals("Highway 17", customers.get(4958).getAddress());
	}

	@Test
	@DisplayName("Record 4959: City is San Mateo")
	void CityOfRecord4959() {
		assertEquals("San Mateo", customers.get(4958).getCity());
	}

	@Test
	@DisplayName("Record 4959: County is Putnam")
	void CountyOfRecord4959() {
		assertEquals("Putnam", customers.get(4958).getCounty());
	}

	@Test
	@DisplayName("Record 4959: State is FL")
	void StateOfRecord4959() {
		assertEquals("FL", customers.get(4958).getState());
	}

	@Test
	@DisplayName("Record 4959: ZIP is 32187")
	void ZIPOfRecord4959() {
		assertEquals("32187", customers.get(4958).getZIP());
	}

	@Test
	@DisplayName("Record 4959: Phone is 386-325-9884")
	void PhoneOfRecord4959() {
		assertEquals("386-325-9884", customers.get(4958).getPhone());
	}

	@Test
	@DisplayName("Record 4959: Fax is 386-325-0656")
	void FaxOfRecord4959() {
		assertEquals("386-325-0656", customers.get(4958).getFax());
	}

	@Test
	@DisplayName("Record 4959: Email is rolf@wyssmann.com")
	void EmailOfRecord4959() {
		assertEquals("rolf@wyssmann.com", customers.get(4958).getEmail());
	}

	@Test
	@DisplayName("Record 4959: Web is http://www.rolfwyssmann.com")
	void WebOfRecord4959() {
		assertEquals("http://www.rolfwyssmann.com", customers.get(4958).getWeb());
	}
}
