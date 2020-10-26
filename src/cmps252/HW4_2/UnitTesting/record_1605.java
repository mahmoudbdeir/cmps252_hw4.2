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

@Tag("9")
class Record_1605 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1605: FirstName is Garry")
	void FirstNameOfRecord1605() {
		assertEquals("Garry", customers.get(1604).getFirstName());
	}

	@Test
	@DisplayName("Record 1605: LastName is Yager")
	void LastNameOfRecord1605() {
		assertEquals("Yager", customers.get(1604).getLastName());
	}

	@Test
	@DisplayName("Record 1605: Company is Berry, David T Esq")
	void CompanyOfRecord1605() {
		assertEquals("Berry, David T Esq", customers.get(1604).getCompany());
	}

	@Test
	@DisplayName("Record 1605: Address is 4316 Webster St")
	void AddressOfRecord1605() {
		assertEquals("4316 Webster St", customers.get(1604).getAddress());
	}

	@Test
	@DisplayName("Record 1605: City is Dayton")
	void CityOfRecord1605() {
		assertEquals("Dayton", customers.get(1604).getCity());
	}

	@Test
	@DisplayName("Record 1605: County is Montgomery")
	void CountyOfRecord1605() {
		assertEquals("Montgomery", customers.get(1604).getCounty());
	}

	@Test
	@DisplayName("Record 1605: State is OH")
	void StateOfRecord1605() {
		assertEquals("OH", customers.get(1604).getState());
	}

	@Test
	@DisplayName("Record 1605: ZIP is 45414")
	void ZIPOfRecord1605() {
		assertEquals("45414", customers.get(1604).getZIP());
	}

	@Test
	@DisplayName("Record 1605: Phone is 937-278-0933")
	void PhoneOfRecord1605() {
		assertEquals("937-278-0933", customers.get(1604).getPhone());
	}

	@Test
	@DisplayName("Record 1605: Fax is 937-278-7697")
	void FaxOfRecord1605() {
		assertEquals("937-278-7697", customers.get(1604).getFax());
	}

	@Test
	@DisplayName("Record 1605: Email is garry@yager.com")
	void EmailOfRecord1605() {
		assertEquals("garry@yager.com", customers.get(1604).getEmail());
	}

	@Test
	@DisplayName("Record 1605: Web is http://www.garryyager.com")
	void WebOfRecord1605() {
		assertEquals("http://www.garryyager.com", customers.get(1604).getWeb());
	}
}
