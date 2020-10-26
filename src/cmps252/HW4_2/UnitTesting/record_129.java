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

@Tag("41")
class Record_129 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 129: FirstName is Kelsey")
	void FirstNameOfRecord129() {
		assertEquals("Kelsey", customers.get(128).getFirstName());
	}

	@Test
	@DisplayName("Record 129: LastName is Caggiano")
	void LastNameOfRecord129() {
		assertEquals("Caggiano", customers.get(128).getLastName());
	}

	@Test
	@DisplayName("Record 129: Company is Giordano, Kevin C Esq")
	void CompanyOfRecord129() {
		assertEquals("Giordano, Kevin C Esq", customers.get(128).getCompany());
	}

	@Test
	@DisplayName("Record 129: Address is 7245 Copperqueen Dr")
	void AddressOfRecord129() {
		assertEquals("7245 Copperqueen Dr", customers.get(128).getAddress());
	}

	@Test
	@DisplayName("Record 129: City is El Paso")
	void CityOfRecord129() {
		assertEquals("El Paso", customers.get(128).getCity());
	}

	@Test
	@DisplayName("Record 129: County is El Paso")
	void CountyOfRecord129() {
		assertEquals("El Paso", customers.get(128).getCounty());
	}

	@Test
	@DisplayName("Record 129: State is TX")
	void StateOfRecord129() {
		assertEquals("TX", customers.get(128).getState());
	}

	@Test
	@DisplayName("Record 129: ZIP is 79915")
	void ZIPOfRecord129() {
		assertEquals("79915", customers.get(128).getZIP());
	}

	@Test
	@DisplayName("Record 129: Phone is 915-532-0436")
	void PhoneOfRecord129() {
		assertEquals("915-532-0436", customers.get(128).getPhone());
	}

	@Test
	@DisplayName("Record 129: Fax is 915-532-1681")
	void FaxOfRecord129() {
		assertEquals("915-532-1681", customers.get(128).getFax());
	}

	@Test
	@DisplayName("Record 129: Email is kelsey@caggiano.com")
	void EmailOfRecord129() {
		assertEquals("kelsey@caggiano.com", customers.get(128).getEmail());
	}

	@Test
	@DisplayName("Record 129: Web is http://www.kelseycaggiano.com")
	void WebOfRecord129() {
		assertEquals("http://www.kelseycaggiano.com", customers.get(128).getWeb());
	}
}
