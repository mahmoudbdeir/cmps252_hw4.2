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

@Tag("38")
class Record_2590 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2590: FirstName is Tanisha")
	void FirstNameOfRecord2590() {
		assertEquals("Tanisha", customers.get(2589).getFirstName());
	}

	@Test
	@DisplayName("Record 2590: LastName is Farler")
	void LastNameOfRecord2590() {
		assertEquals("Farler", customers.get(2589).getLastName());
	}

	@Test
	@DisplayName("Record 2590: Company is National Exec Fund Life Ins Co")
	void CompanyOfRecord2590() {
		assertEquals("National Exec Fund Life Ins Co", customers.get(2589).getCompany());
	}

	@Test
	@DisplayName("Record 2590: Address is Box #-2865")
	void AddressOfRecord2590() {
		assertEquals("Box #-2865", customers.get(2589).getAddress());
	}

	@Test
	@DisplayName("Record 2590: City is Edmond")
	void CityOfRecord2590() {
		assertEquals("Edmond", customers.get(2589).getCity());
	}

	@Test
	@DisplayName("Record 2590: County is Oklahoma")
	void CountyOfRecord2590() {
		assertEquals("Oklahoma", customers.get(2589).getCounty());
	}

	@Test
	@DisplayName("Record 2590: State is OK")
	void StateOfRecord2590() {
		assertEquals("OK", customers.get(2589).getState());
	}

	@Test
	@DisplayName("Record 2590: ZIP is 73083")
	void ZIPOfRecord2590() {
		assertEquals("73083", customers.get(2589).getZIP());
	}

	@Test
	@DisplayName("Record 2590: Phone is 405-340-1489")
	void PhoneOfRecord2590() {
		assertEquals("405-340-1489", customers.get(2589).getPhone());
	}

	@Test
	@DisplayName("Record 2590: Fax is 405-340-0867")
	void FaxOfRecord2590() {
		assertEquals("405-340-0867", customers.get(2589).getFax());
	}

	@Test
	@DisplayName("Record 2590: Email is tanisha@farler.com")
	void EmailOfRecord2590() {
		assertEquals("tanisha@farler.com", customers.get(2589).getEmail());
	}

	@Test
	@DisplayName("Record 2590: Web is http://www.tanishafarler.com")
	void WebOfRecord2590() {
		assertEquals("http://www.tanishafarler.com", customers.get(2589).getWeb());
	}
}
