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

@Tag("17")
class Record_349 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 349: FirstName is Jermaine")
	void FirstNameOfRecord349() {
		assertEquals("Jermaine", customers.get(348).getFirstName());
	}

	@Test
	@DisplayName("Record 349: LastName is ynstone")
	void LastNameOfRecord349() {
		assertEquals("ynstone", customers.get(348).getLastName());
	}

	@Test
	@DisplayName("Record 349: Company is Wells Fargo Grd Svc Emplmnt Ln")
	void CompanyOfRecord349() {
		assertEquals("Wells Fargo Grd Svc Emplmnt Ln", customers.get(348).getCompany());
	}

	@Test
	@DisplayName("Record 349: Address is Birmingham Ridge Rd")
	void AddressOfRecord349() {
		assertEquals("Birmingham Ridge Rd", customers.get(348).getAddress());
	}

	@Test
	@DisplayName("Record 349: City is Saltillo")
	void CityOfRecord349() {
		assertEquals("Saltillo", customers.get(348).getCity());
	}

	@Test
	@DisplayName("Record 349: County is Lee")
	void CountyOfRecord349() {
		assertEquals("Lee", customers.get(348).getCounty());
	}

	@Test
	@DisplayName("Record 349: State is MS")
	void StateOfRecord349() {
		assertEquals("MS", customers.get(348).getState());
	}

	@Test
	@DisplayName("Record 349: ZIP is 38866")
	void ZIPOfRecord349() {
		assertEquals("38866", customers.get(348).getZIP());
	}

	@Test
	@DisplayName("Record 349: Phone is 662-869-4429")
	void PhoneOfRecord349() {
		assertEquals("662-869-4429", customers.get(348).getPhone());
	}

	@Test
	@DisplayName("Record 349: Fax is 662-869-6015")
	void FaxOfRecord349() {
		assertEquals("662-869-6015", customers.get(348).getFax());
	}

	@Test
	@DisplayName("Record 349: Email is jermaine@ynstone.com")
	void EmailOfRecord349() {
		assertEquals("jermaine@ynstone.com", customers.get(348).getEmail());
	}

	@Test
	@DisplayName("Record 349: Web is http://www.jermaineynstone.com")
	void WebOfRecord349() {
		assertEquals("http://www.jermaineynstone.com", customers.get(348).getWeb());
	}
}
