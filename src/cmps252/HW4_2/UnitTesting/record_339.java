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

@Tag("19")
class Record_339 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 339: FirstName is Ike")
	void FirstNameOfRecord339() {
		assertEquals("Ike", customers.get(338).getFirstName());
	}

	@Test
	@DisplayName("Record 339: LastName is Schmand")
	void LastNameOfRecord339() {
		assertEquals("Schmand", customers.get(338).getLastName());
	}

	@Test
	@DisplayName("Record 339: Company is Behnkes Paramus Bldg Supl Co")
	void CompanyOfRecord339() {
		assertEquals("Behnkes Paramus Bldg Supl Co", customers.get(338).getCompany());
	}

	@Test
	@DisplayName("Record 339: Address is 25520 Stanford Aven  #-311")
	void AddressOfRecord339() {
		assertEquals("25520 Stanford Aven  #-311", customers.get(338).getAddress());
	}

	@Test
	@DisplayName("Record 339: City is Valencia")
	void CityOfRecord339() {
		assertEquals("Valencia", customers.get(338).getCity());
	}

	@Test
	@DisplayName("Record 339: County is Los Angeles")
	void CountyOfRecord339() {
		assertEquals("Los Angeles", customers.get(338).getCounty());
	}

	@Test
	@DisplayName("Record 339: State is CA")
	void StateOfRecord339() {
		assertEquals("CA", customers.get(338).getState());
	}

	@Test
	@DisplayName("Record 339: ZIP is 91355")
	void ZIPOfRecord339() {
		assertEquals("91355", customers.get(338).getZIP());
	}

	@Test
	@DisplayName("Record 339: Phone is 661-257-9367")
	void PhoneOfRecord339() {
		assertEquals("661-257-9367", customers.get(338).getPhone());
	}

	@Test
	@DisplayName("Record 339: Fax is 661-257-5583")
	void FaxOfRecord339() {
		assertEquals("661-257-5583", customers.get(338).getFax());
	}

	@Test
	@DisplayName("Record 339: Email is ike@schmand.com")
	void EmailOfRecord339() {
		assertEquals("ike@schmand.com", customers.get(338).getEmail());
	}

	@Test
	@DisplayName("Record 339: Web is http://www.ikeschmand.com")
	void WebOfRecord339() {
		assertEquals("http://www.ikeschmand.com", customers.get(338).getWeb());
	}
}
