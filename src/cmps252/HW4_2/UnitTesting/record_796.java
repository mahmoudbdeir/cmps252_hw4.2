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

@Tag("26")
class Record_796 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 796: FirstName is Melba")
	void FirstNameOfRecord796() {
		assertEquals("Melba", customers.get(795).getFirstName());
	}

	@Test
	@DisplayName("Record 796: LastName is Halma")
	void LastNameOfRecord796() {
		assertEquals("Halma", customers.get(795).getLastName());
	}

	@Test
	@DisplayName("Record 796: Company is Prestonsburg Cmnty Cllg U K")
	void CompanyOfRecord796() {
		assertEquals("Prestonsburg Cmnty Cllg U K", customers.get(795).getCompany());
	}

	@Test
	@DisplayName("Record 796: Address is 3198 Airport Loop Dr")
	void AddressOfRecord796() {
		assertEquals("3198 Airport Loop Dr", customers.get(795).getAddress());
	}

	@Test
	@DisplayName("Record 796: City is Costa Mesa")
	void CityOfRecord796() {
		assertEquals("Costa Mesa", customers.get(795).getCity());
	}

	@Test
	@DisplayName("Record 796: County is Orange")
	void CountyOfRecord796() {
		assertEquals("Orange", customers.get(795).getCounty());
	}

	@Test
	@DisplayName("Record 796: State is CA")
	void StateOfRecord796() {
		assertEquals("CA", customers.get(795).getState());
	}

	@Test
	@DisplayName("Record 796: ZIP is 92626")
	void ZIPOfRecord796() {
		assertEquals("92626", customers.get(795).getZIP());
	}

	@Test
	@DisplayName("Record 796: Phone is 949-549-2949")
	void PhoneOfRecord796() {
		assertEquals("949-549-2949", customers.get(795).getPhone());
	}

	@Test
	@DisplayName("Record 796: Fax is 949-549-0669")
	void FaxOfRecord796() {
		assertEquals("949-549-0669", customers.get(795).getFax());
	}

	@Test
	@DisplayName("Record 796: Email is melba@halma.com")
	void EmailOfRecord796() {
		assertEquals("melba@halma.com", customers.get(795).getEmail());
	}

	@Test
	@DisplayName("Record 796: Web is http://www.melbahalma.com")
	void WebOfRecord796() {
		assertEquals("http://www.melbahalma.com", customers.get(795).getWeb());
	}
}
