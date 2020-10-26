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

@Tag("23")
class Record_4574 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4574: FirstName is Donna")
	void FirstNameOfRecord4574() {
		assertEquals("Donna", customers.get(4573).getFirstName());
	}

	@Test
	@DisplayName("Record 4574: LastName is Hebrank")
	void LastNameOfRecord4574() {
		assertEquals("Hebrank", customers.get(4573).getLastName());
	}

	@Test
	@DisplayName("Record 4574: Company is Pinay Flooring")
	void CompanyOfRecord4574() {
		assertEquals("Pinay Flooring", customers.get(4573).getCompany());
	}

	@Test
	@DisplayName("Record 4574: Address is 500 N Valley Mills Dr  #-208")
	void AddressOfRecord4574() {
		assertEquals("500 N Valley Mills Dr  #-208", customers.get(4573).getAddress());
	}

	@Test
	@DisplayName("Record 4574: City is Waco")
	void CityOfRecord4574() {
		assertEquals("Waco", customers.get(4573).getCity());
	}

	@Test
	@DisplayName("Record 4574: County is McLennan")
	void CountyOfRecord4574() {
		assertEquals("McLennan", customers.get(4573).getCounty());
	}

	@Test
	@DisplayName("Record 4574: State is TX")
	void StateOfRecord4574() {
		assertEquals("TX", customers.get(4573).getState());
	}

	@Test
	@DisplayName("Record 4574: ZIP is 76710")
	void ZIPOfRecord4574() {
		assertEquals("76710", customers.get(4573).getZIP());
	}

	@Test
	@DisplayName("Record 4574: Phone is 254-751-5291")
	void PhoneOfRecord4574() {
		assertEquals("254-751-5291", customers.get(4573).getPhone());
	}

	@Test
	@DisplayName("Record 4574: Fax is 254-751-2637")
	void FaxOfRecord4574() {
		assertEquals("254-751-2637", customers.get(4573).getFax());
	}

	@Test
	@DisplayName("Record 4574: Email is donna@hebrank.com")
	void EmailOfRecord4574() {
		assertEquals("donna@hebrank.com", customers.get(4573).getEmail());
	}

	@Test
	@DisplayName("Record 4574: Web is http://www.donnahebrank.com")
	void WebOfRecord4574() {
		assertEquals("http://www.donnahebrank.com", customers.get(4573).getWeb());
	}
}
