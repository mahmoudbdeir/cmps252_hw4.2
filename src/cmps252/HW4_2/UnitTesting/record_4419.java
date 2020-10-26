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

@Tag("47")
class Record_4419 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4419: FirstName is Emanuel")
	void FirstNameOfRecord4419() {
		assertEquals("Emanuel", customers.get(4418).getFirstName());
	}

	@Test
	@DisplayName("Record 4419: LastName is Yearby")
	void LastNameOfRecord4419() {
		assertEquals("Yearby", customers.get(4418).getLastName());
	}

	@Test
	@DisplayName("Record 4419: Company is beamgardt Home Inspection")
	void CompanyOfRecord4419() {
		assertEquals("beamgardt Home Inspection", customers.get(4418).getCompany());
	}

	@Test
	@DisplayName("Record 4419: Address is 4422 Youngstown Rd Se")
	void AddressOfRecord4419() {
		assertEquals("4422 Youngstown Rd Se", customers.get(4418).getAddress());
	}

	@Test
	@DisplayName("Record 4419: City is Warren")
	void CityOfRecord4419() {
		assertEquals("Warren", customers.get(4418).getCity());
	}

	@Test
	@DisplayName("Record 4419: County is Trumbull")
	void CountyOfRecord4419() {
		assertEquals("Trumbull", customers.get(4418).getCounty());
	}

	@Test
	@DisplayName("Record 4419: State is OH")
	void StateOfRecord4419() {
		assertEquals("OH", customers.get(4418).getState());
	}

	@Test
	@DisplayName("Record 4419: ZIP is 44484")
	void ZIPOfRecord4419() {
		assertEquals("44484", customers.get(4418).getZIP());
	}

	@Test
	@DisplayName("Record 4419: Phone is 330-545-6041")
	void PhoneOfRecord4419() {
		assertEquals("330-545-6041", customers.get(4418).getPhone());
	}

	@Test
	@DisplayName("Record 4419: Fax is 330-545-5923")
	void FaxOfRecord4419() {
		assertEquals("330-545-5923", customers.get(4418).getFax());
	}

	@Test
	@DisplayName("Record 4419: Email is emanuel@yearby.com")
	void EmailOfRecord4419() {
		assertEquals("emanuel@yearby.com", customers.get(4418).getEmail());
	}

	@Test
	@DisplayName("Record 4419: Web is http://www.emanuelyearby.com")
	void WebOfRecord4419() {
		assertEquals("http://www.emanuelyearby.com", customers.get(4418).getWeb());
	}
}
