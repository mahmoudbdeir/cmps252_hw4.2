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

@Tag("24")
class Record_1754 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1754: FirstName is Melody")
	void FirstNameOfRecord1754() {
		assertEquals("Melody", customers.get(1753).getFirstName());
	}

	@Test
	@DisplayName("Record 1754: LastName is Oba")
	void LastNameOfRecord1754() {
		assertEquals("Oba", customers.get(1753).getLastName());
	}

	@Test
	@DisplayName("Record 1754: Company is Daamen Inc")
	void CompanyOfRecord1754() {
		assertEquals("Daamen Inc", customers.get(1753).getCompany());
	}

	@Test
	@DisplayName("Record 1754: Address is 950 Penn Ave")
	void AddressOfRecord1754() {
		assertEquals("950 Penn Ave", customers.get(1753).getAddress());
	}

	@Test
	@DisplayName("Record 1754: City is Pittsburgh")
	void CityOfRecord1754() {
		assertEquals("Pittsburgh", customers.get(1753).getCity());
	}

	@Test
	@DisplayName("Record 1754: County is Allegheny")
	void CountyOfRecord1754() {
		assertEquals("Allegheny", customers.get(1753).getCounty());
	}

	@Test
	@DisplayName("Record 1754: State is PA")
	void StateOfRecord1754() {
		assertEquals("PA", customers.get(1753).getState());
	}

	@Test
	@DisplayName("Record 1754: ZIP is 15222")
	void ZIPOfRecord1754() {
		assertEquals("15222", customers.get(1753).getZIP());
	}

	@Test
	@DisplayName("Record 1754: Phone is 412-281-4150")
	void PhoneOfRecord1754() {
		assertEquals("412-281-4150", customers.get(1753).getPhone());
	}

	@Test
	@DisplayName("Record 1754: Fax is 412-281-4495")
	void FaxOfRecord1754() {
		assertEquals("412-281-4495", customers.get(1753).getFax());
	}

	@Test
	@DisplayName("Record 1754: Email is melody@oba.com")
	void EmailOfRecord1754() {
		assertEquals("melody@oba.com", customers.get(1753).getEmail());
	}

	@Test
	@DisplayName("Record 1754: Web is http://www.melodyoba.com")
	void WebOfRecord1754() {
		assertEquals("http://www.melodyoba.com", customers.get(1753).getWeb());
	}
}
