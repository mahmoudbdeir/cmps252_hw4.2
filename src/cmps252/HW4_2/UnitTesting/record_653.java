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

@Tag("29")
class Record_653 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 653: FirstName is Becky")
	void FirstNameOfRecord653() {
		assertEquals("Becky", customers.get(652).getFirstName());
	}

	@Test
	@DisplayName("Record 653: LastName is Vogel")
	void LastNameOfRecord653() {
		assertEquals("Vogel", customers.get(652).getLastName());
	}

	@Test
	@DisplayName("Record 653: Company is Holmes, Warren Lane Esq")
	void CompanyOfRecord653() {
		assertEquals("Holmes, Warren Lane Esq", customers.get(652).getCompany());
	}

	@Test
	@DisplayName("Record 653: Address is 2540 Glenda Ln  #-120")
	void AddressOfRecord653() {
		assertEquals("2540 Glenda Ln  #-120", customers.get(652).getAddress());
	}

	@Test
	@DisplayName("Record 653: City is Dallas")
	void CityOfRecord653() {
		assertEquals("Dallas", customers.get(652).getCity());
	}

	@Test
	@DisplayName("Record 653: County is Dallas")
	void CountyOfRecord653() {
		assertEquals("Dallas", customers.get(652).getCounty());
	}

	@Test
	@DisplayName("Record 653: State is TX")
	void StateOfRecord653() {
		assertEquals("TX", customers.get(652).getState());
	}

	@Test
	@DisplayName("Record 653: ZIP is 75229")
	void ZIPOfRecord653() {
		assertEquals("75229", customers.get(652).getZIP());
	}

	@Test
	@DisplayName("Record 653: Phone is 214-484-9961")
	void PhoneOfRecord653() {
		assertEquals("214-484-9961", customers.get(652).getPhone());
	}

	@Test
	@DisplayName("Record 653: Fax is 214-484-1762")
	void FaxOfRecord653() {
		assertEquals("214-484-1762", customers.get(652).getFax());
	}

	@Test
	@DisplayName("Record 653: Email is becky@vogel.com")
	void EmailOfRecord653() {
		assertEquals("becky@vogel.com", customers.get(652).getEmail());
	}

	@Test
	@DisplayName("Record 653: Web is http://www.beckyvogel.com")
	void WebOfRecord653() {
		assertEquals("http://www.beckyvogel.com", customers.get(652).getWeb());
	}
}
