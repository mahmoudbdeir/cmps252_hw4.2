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

@Tag("49")
class Record_3060 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3060: FirstName is Carlos")
	void FirstNameOfRecord3060() {
		assertEquals("Carlos", customers.get(3059).getFirstName());
	}

	@Test
	@DisplayName("Record 3060: LastName is Teakell")
	void LastNameOfRecord3060() {
		assertEquals("Teakell", customers.get(3059).getLastName());
	}

	@Test
	@DisplayName("Record 3060: Company is Brooks & Raub Attorneys At Law")
	void CompanyOfRecord3060() {
		assertEquals("Brooks & Raub Attorneys At Law", customers.get(3059).getCompany());
	}

	@Test
	@DisplayName("Record 3060: Address is 1001 Americas Ave  #-700")
	void AddressOfRecord3060() {
		assertEquals("1001 Americas Ave  #-700", customers.get(3059).getAddress());
	}

	@Test
	@DisplayName("Record 3060: City is New York")
	void CityOfRecord3060() {
		assertEquals("New York", customers.get(3059).getCity());
	}

	@Test
	@DisplayName("Record 3060: County is New York")
	void CountyOfRecord3060() {
		assertEquals("New York", customers.get(3059).getCounty());
	}

	@Test
	@DisplayName("Record 3060: State is NY")
	void StateOfRecord3060() {
		assertEquals("NY", customers.get(3059).getState());
	}

	@Test
	@DisplayName("Record 3060: ZIP is 10018")
	void ZIPOfRecord3060() {
		assertEquals("10018", customers.get(3059).getZIP());
	}

	@Test
	@DisplayName("Record 3060: Phone is 212-997-3085")
	void PhoneOfRecord3060() {
		assertEquals("212-997-3085", customers.get(3059).getPhone());
	}

	@Test
	@DisplayName("Record 3060: Fax is 212-997-0086")
	void FaxOfRecord3060() {
		assertEquals("212-997-0086", customers.get(3059).getFax());
	}

	@Test
	@DisplayName("Record 3060: Email is carlos@teakell.com")
	void EmailOfRecord3060() {
		assertEquals("carlos@teakell.com", customers.get(3059).getEmail());
	}

	@Test
	@DisplayName("Record 3060: Web is http://www.carlosteakell.com")
	void WebOfRecord3060() {
		assertEquals("http://www.carlosteakell.com", customers.get(3059).getWeb());
	}
}
