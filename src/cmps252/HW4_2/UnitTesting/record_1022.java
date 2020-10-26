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

@Tag("45")
class Record_1022 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1022: FirstName is Larissa")
	void FirstNameOfRecord1022() {
		assertEquals("Larissa", customers.get(1021).getFirstName());
	}

	@Test
	@DisplayName("Record 1022: LastName is Guzik")
	void LastNameOfRecord1022() {
		assertEquals("Guzik", customers.get(1021).getLastName());
	}

	@Test
	@DisplayName("Record 1022: Company is I J White Corp")
	void CompanyOfRecord1022() {
		assertEquals("I J White Corp", customers.get(1021).getCompany());
	}

	@Test
	@DisplayName("Record 1022: Address is 3215 W Irving Park Rd")
	void AddressOfRecord1022() {
		assertEquals("3215 W Irving Park Rd", customers.get(1021).getAddress());
	}

	@Test
	@DisplayName("Record 1022: City is Chicago")
	void CityOfRecord1022() {
		assertEquals("Chicago", customers.get(1021).getCity());
	}

	@Test
	@DisplayName("Record 1022: County is Cook")
	void CountyOfRecord1022() {
		assertEquals("Cook", customers.get(1021).getCounty());
	}

	@Test
	@DisplayName("Record 1022: State is IL")
	void StateOfRecord1022() {
		assertEquals("IL", customers.get(1021).getState());
	}

	@Test
	@DisplayName("Record 1022: ZIP is 60618")
	void ZIPOfRecord1022() {
		assertEquals("60618", customers.get(1021).getZIP());
	}

	@Test
	@DisplayName("Record 1022: Phone is 773-588-1266")
	void PhoneOfRecord1022() {
		assertEquals("773-588-1266", customers.get(1021).getPhone());
	}

	@Test
	@DisplayName("Record 1022: Fax is 773-588-4195")
	void FaxOfRecord1022() {
		assertEquals("773-588-4195", customers.get(1021).getFax());
	}

	@Test
	@DisplayName("Record 1022: Email is larissa@guzik.com")
	void EmailOfRecord1022() {
		assertEquals("larissa@guzik.com", customers.get(1021).getEmail());
	}

	@Test
	@DisplayName("Record 1022: Web is http://www.larissaguzik.com")
	void WebOfRecord1022() {
		assertEquals("http://www.larissaguzik.com", customers.get(1021).getWeb());
	}
}
