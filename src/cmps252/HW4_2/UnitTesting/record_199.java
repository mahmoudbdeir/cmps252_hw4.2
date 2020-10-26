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

@Tag("49")
class Record_199 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 199: FirstName is Shayne")
	void FirstNameOfRecord199() {
		assertEquals("Shayne", customers.get(198).getFirstName());
	}

	@Test
	@DisplayName("Record 199: LastName is Spece")
	void LastNameOfRecord199() {
		assertEquals("Spece", customers.get(198).getLastName());
	}

	@Test
	@DisplayName("Record 199: Company is Presbyterian Homes Of N J")
	void CompanyOfRecord199() {
		assertEquals("Presbyterian Homes Of N J", customers.get(198).getCompany());
	}

	@Test
	@DisplayName("Record 199: Address is 2122 Mannix Dr")
	void AddressOfRecord199() {
		assertEquals("2122 Mannix Dr", customers.get(198).getAddress());
	}

	@Test
	@DisplayName("Record 199: City is San Antonio")
	void CityOfRecord199() {
		assertEquals("San Antonio", customers.get(198).getCity());
	}

	@Test
	@DisplayName("Record 199: County is Bexar")
	void CountyOfRecord199() {
		assertEquals("Bexar", customers.get(198).getCounty());
	}

	@Test
	@DisplayName("Record 199: State is TX")
	void StateOfRecord199() {
		assertEquals("TX", customers.get(198).getState());
	}

	@Test
	@DisplayName("Record 199: ZIP is 78217")
	void ZIPOfRecord199() {
		assertEquals("78217", customers.get(198).getZIP());
	}

	@Test
	@DisplayName("Record 199: Phone is 210-824-3012")
	void PhoneOfRecord199() {
		assertEquals("210-824-3012", customers.get(198).getPhone());
	}

	@Test
	@DisplayName("Record 199: Fax is 210-824-6129")
	void FaxOfRecord199() {
		assertEquals("210-824-6129", customers.get(198).getFax());
	}

	@Test
	@DisplayName("Record 199: Email is shayne@spece.com")
	void EmailOfRecord199() {
		assertEquals("shayne@spece.com", customers.get(198).getEmail());
	}

	@Test
	@DisplayName("Record 199: Web is http://www.shaynespece.com")
	void WebOfRecord199() {
		assertEquals("http://www.shaynespece.com", customers.get(198).getWeb());
	}
}
