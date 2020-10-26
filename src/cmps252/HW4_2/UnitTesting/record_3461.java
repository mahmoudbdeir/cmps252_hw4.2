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

@Tag("20")
class Record_3461 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3461: FirstName is Moises")
	void FirstNameOfRecord3461() {
		assertEquals("Moises", customers.get(3460).getFirstName());
	}

	@Test
	@DisplayName("Record 3461: LastName is Strohl")
	void LastNameOfRecord3461() {
		assertEquals("Strohl", customers.get(3460).getLastName());
	}

	@Test
	@DisplayName("Record 3461: Company is Independent Stamping Inc")
	void CompanyOfRecord3461() {
		assertEquals("Independent Stamping Inc", customers.get(3460).getCompany());
	}

	@Test
	@DisplayName("Record 3461: Address is 8311 Eastpoint Dr  #-400")
	void AddressOfRecord3461() {
		assertEquals("8311 Eastpoint Dr  #-400", customers.get(3460).getAddress());
	}

	@Test
	@DisplayName("Record 3461: City is Dallas")
	void CityOfRecord3461() {
		assertEquals("Dallas", customers.get(3460).getCity());
	}

	@Test
	@DisplayName("Record 3461: County is Dallas")
	void CountyOfRecord3461() {
		assertEquals("Dallas", customers.get(3460).getCounty());
	}

	@Test
	@DisplayName("Record 3461: State is TX")
	void StateOfRecord3461() {
		assertEquals("TX", customers.get(3460).getState());
	}

	@Test
	@DisplayName("Record 3461: ZIP is 75227")
	void ZIPOfRecord3461() {
		assertEquals("75227", customers.get(3460).getZIP());
	}

	@Test
	@DisplayName("Record 3461: Phone is 214-381-0889")
	void PhoneOfRecord3461() {
		assertEquals("214-381-0889", customers.get(3460).getPhone());
	}

	@Test
	@DisplayName("Record 3461: Fax is 214-381-2823")
	void FaxOfRecord3461() {
		assertEquals("214-381-2823", customers.get(3460).getFax());
	}

	@Test
	@DisplayName("Record 3461: Email is moises@strohl.com")
	void EmailOfRecord3461() {
		assertEquals("moises@strohl.com", customers.get(3460).getEmail());
	}

	@Test
	@DisplayName("Record 3461: Web is http://www.moisesstrohl.com")
	void WebOfRecord3461() {
		assertEquals("http://www.moisesstrohl.com", customers.get(3460).getWeb());
	}
}
