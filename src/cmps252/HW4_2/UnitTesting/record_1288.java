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
class Record_1288 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1288: FirstName is Joy")
	void FirstNameOfRecord1288() {
		assertEquals("Joy", customers.get(1287).getFirstName());
	}

	@Test
	@DisplayName("Record 1288: LastName is Ukich")
	void LastNameOfRecord1288() {
		assertEquals("Ukich", customers.get(1287).getLastName());
	}

	@Test
	@DisplayName("Record 1288: Company is Fogel Anderson Constr Co")
	void CompanyOfRecord1288() {
		assertEquals("Fogel Anderson Constr Co", customers.get(1287).getCompany());
	}

	@Test
	@DisplayName("Record 1288: Address is 1520 Caton Center Dr  #-d")
	void AddressOfRecord1288() {
		assertEquals("1520 Caton Center Dr  #-d", customers.get(1287).getAddress());
	}

	@Test
	@DisplayName("Record 1288: City is Halethorpe")
	void CityOfRecord1288() {
		assertEquals("Halethorpe", customers.get(1287).getCity());
	}

	@Test
	@DisplayName("Record 1288: County is Baltimore")
	void CountyOfRecord1288() {
		assertEquals("Baltimore", customers.get(1287).getCounty());
	}

	@Test
	@DisplayName("Record 1288: State is MD")
	void StateOfRecord1288() {
		assertEquals("MD", customers.get(1287).getState());
	}

	@Test
	@DisplayName("Record 1288: ZIP is 21227")
	void ZIPOfRecord1288() {
		assertEquals("21227", customers.get(1287).getZIP());
	}

	@Test
	@DisplayName("Record 1288: Phone is 410-247-2174")
	void PhoneOfRecord1288() {
		assertEquals("410-247-2174", customers.get(1287).getPhone());
	}

	@Test
	@DisplayName("Record 1288: Fax is 410-247-9331")
	void FaxOfRecord1288() {
		assertEquals("410-247-9331", customers.get(1287).getFax());
	}

	@Test
	@DisplayName("Record 1288: Email is joy@ukich.com")
	void EmailOfRecord1288() {
		assertEquals("joy@ukich.com", customers.get(1287).getEmail());
	}

	@Test
	@DisplayName("Record 1288: Web is http://www.joyukich.com")
	void WebOfRecord1288() {
		assertEquals("http://www.joyukich.com", customers.get(1287).getWeb());
	}
}
