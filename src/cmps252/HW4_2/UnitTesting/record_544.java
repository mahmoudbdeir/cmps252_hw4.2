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

@Tag("34")
class Record_544 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 544: FirstName is Ryna")
	void FirstNameOfRecord544() {
		assertEquals("Ryna", customers.get(543).getFirstName());
	}

	@Test
	@DisplayName("Record 544: LastName is Latos")
	void LastNameOfRecord544() {
		assertEquals("Latos", customers.get(543).getLastName());
	}

	@Test
	@DisplayName("Record 544: Company is Scholl, Roy W Iii")
	void CompanyOfRecord544() {
		assertEquals("Scholl, Roy W Iii", customers.get(543).getCompany());
	}

	@Test
	@DisplayName("Record 544: Address is 270 N Trimble Rd")
	void AddressOfRecord544() {
		assertEquals("270 N Trimble Rd", customers.get(543).getAddress());
	}

	@Test
	@DisplayName("Record 544: City is Mansfield")
	void CityOfRecord544() {
		assertEquals("Mansfield", customers.get(543).getCity());
	}

	@Test
	@DisplayName("Record 544: County is Richland")
	void CountyOfRecord544() {
		assertEquals("Richland", customers.get(543).getCounty());
	}

	@Test
	@DisplayName("Record 544: State is OH")
	void StateOfRecord544() {
		assertEquals("OH", customers.get(543).getState());
	}

	@Test
	@DisplayName("Record 544: ZIP is 44906")
	void ZIPOfRecord544() {
		assertEquals("44906", customers.get(543).getZIP());
	}

	@Test
	@DisplayName("Record 544: Phone is 419-529-1710")
	void PhoneOfRecord544() {
		assertEquals("419-529-1710", customers.get(543).getPhone());
	}

	@Test
	@DisplayName("Record 544: Fax is 419-529-9088")
	void FaxOfRecord544() {
		assertEquals("419-529-9088", customers.get(543).getFax());
	}

	@Test
	@DisplayName("Record 544: Email is ryna@latos.com")
	void EmailOfRecord544() {
		assertEquals("ryna@latos.com", customers.get(543).getEmail());
	}

	@Test
	@DisplayName("Record 544: Web is http://www.rynalatos.com")
	void WebOfRecord544() {
		assertEquals("http://www.rynalatos.com", customers.get(543).getWeb());
	}
}
