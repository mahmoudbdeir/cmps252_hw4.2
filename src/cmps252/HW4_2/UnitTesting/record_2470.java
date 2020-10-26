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

@Tag("47")
class Record_2470 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2470: FirstName is Paige")
	void FirstNameOfRecord2470() {
		assertEquals("Paige", customers.get(2469).getFirstName());
	}

	@Test
	@DisplayName("Record 2470: LastName is Grudt")
	void LastNameOfRecord2470() {
		assertEquals("Grudt", customers.get(2469).getLastName());
	}

	@Test
	@DisplayName("Record 2470: Company is Ritti, Eugene A Esq")
	void CompanyOfRecord2470() {
		assertEquals("Ritti, Eugene A Esq", customers.get(2469).getCompany());
	}

	@Test
	@DisplayName("Record 2470: Address is Box #-50833")
	void AddressOfRecord2470() {
		assertEquals("Box #-50833", customers.get(2469).getAddress());
	}

	@Test
	@DisplayName("Record 2470: City is Reno")
	void CityOfRecord2470() {
		assertEquals("Reno", customers.get(2469).getCity());
	}

	@Test
	@DisplayName("Record 2470: County is Washoe")
	void CountyOfRecord2470() {
		assertEquals("Washoe", customers.get(2469).getCounty());
	}

	@Test
	@DisplayName("Record 2470: State is NV")
	void StateOfRecord2470() {
		assertEquals("NV", customers.get(2469).getState());
	}

	@Test
	@DisplayName("Record 2470: ZIP is 89513")
	void ZIPOfRecord2470() {
		assertEquals("89513", customers.get(2469).getZIP());
	}

	@Test
	@DisplayName("Record 2470: Phone is 775-747-5509")
	void PhoneOfRecord2470() {
		assertEquals("775-747-5509", customers.get(2469).getPhone());
	}

	@Test
	@DisplayName("Record 2470: Fax is 775-747-6476")
	void FaxOfRecord2470() {
		assertEquals("775-747-6476", customers.get(2469).getFax());
	}

	@Test
	@DisplayName("Record 2470: Email is paige@grudt.com")
	void EmailOfRecord2470() {
		assertEquals("paige@grudt.com", customers.get(2469).getEmail());
	}

	@Test
	@DisplayName("Record 2470: Web is http://www.paigegrudt.com")
	void WebOfRecord2470() {
		assertEquals("http://www.paigegrudt.com", customers.get(2469).getWeb());
	}
}
