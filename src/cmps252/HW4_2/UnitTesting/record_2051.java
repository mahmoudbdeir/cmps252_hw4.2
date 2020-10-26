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

@Tag("4")
class Record_2051 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2051: FirstName is Paula")
	void FirstNameOfRecord2051() {
		assertEquals("Paula", customers.get(2050).getFirstName());
	}

	@Test
	@DisplayName("Record 2051: LastName is Tancredi")
	void LastNameOfRecord2051() {
		assertEquals("Tancredi", customers.get(2050).getLastName());
	}

	@Test
	@DisplayName("Record 2051: Company is Texas World Operations Inc")
	void CompanyOfRecord2051() {
		assertEquals("Texas World Operations Inc", customers.get(2050).getCompany());
	}

	@Test
	@DisplayName("Record 2051: Address is 1141 Larry Mahan Dr")
	void AddressOfRecord2051() {
		assertEquals("1141 Larry Mahan Dr", customers.get(2050).getAddress());
	}

	@Test
	@DisplayName("Record 2051: City is El Paso")
	void CityOfRecord2051() {
		assertEquals("El Paso", customers.get(2050).getCity());
	}

	@Test
	@DisplayName("Record 2051: County is El Paso")
	void CountyOfRecord2051() {
		assertEquals("El Paso", customers.get(2050).getCounty());
	}

	@Test
	@DisplayName("Record 2051: State is TX")
	void StateOfRecord2051() {
		assertEquals("TX", customers.get(2050).getState());
	}

	@Test
	@DisplayName("Record 2051: ZIP is 79925")
	void ZIPOfRecord2051() {
		assertEquals("79925", customers.get(2050).getZIP());
	}

	@Test
	@DisplayName("Record 2051: Phone is 915-599-7975")
	void PhoneOfRecord2051() {
		assertEquals("915-599-7975", customers.get(2050).getPhone());
	}

	@Test
	@DisplayName("Record 2051: Fax is 915-599-6683")
	void FaxOfRecord2051() {
		assertEquals("915-599-6683", customers.get(2050).getFax());
	}

	@Test
	@DisplayName("Record 2051: Email is paula@tancredi.com")
	void EmailOfRecord2051() {
		assertEquals("paula@tancredi.com", customers.get(2050).getEmail());
	}

	@Test
	@DisplayName("Record 2051: Web is http://www.paulatancredi.com")
	void WebOfRecord2051() {
		assertEquals("http://www.paulatancredi.com", customers.get(2050).getWeb());
	}
}
