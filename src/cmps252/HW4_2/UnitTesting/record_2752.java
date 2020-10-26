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

@Tag("10")
class Record_2752 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2752: FirstName is Marcia")
	void FirstNameOfRecord2752() {
		assertEquals("Marcia", customers.get(2751).getFirstName());
	}

	@Test
	@DisplayName("Record 2752: LastName is Maruyama")
	void LastNameOfRecord2752() {
		assertEquals("Maruyama", customers.get(2751).getLastName());
	}

	@Test
	@DisplayName("Record 2752: Company is Katco Office Supplies")
	void CompanyOfRecord2752() {
		assertEquals("Katco Office Supplies", customers.get(2751).getCompany());
	}

	@Test
	@DisplayName("Record 2752: Address is 554 White Pond Dr  #-c")
	void AddressOfRecord2752() {
		assertEquals("554 White Pond Dr  #-c", customers.get(2751).getAddress());
	}

	@Test
	@DisplayName("Record 2752: City is Akron")
	void CityOfRecord2752() {
		assertEquals("Akron", customers.get(2751).getCity());
	}

	@Test
	@DisplayName("Record 2752: County is Summit")
	void CountyOfRecord2752() {
		assertEquals("Summit", customers.get(2751).getCounty());
	}

	@Test
	@DisplayName("Record 2752: State is OH")
	void StateOfRecord2752() {
		assertEquals("OH", customers.get(2751).getState());
	}

	@Test
	@DisplayName("Record 2752: ZIP is 44320")
	void ZIPOfRecord2752() {
		assertEquals("44320", customers.get(2751).getZIP());
	}

	@Test
	@DisplayName("Record 2752: Phone is 330-836-6547")
	void PhoneOfRecord2752() {
		assertEquals("330-836-6547", customers.get(2751).getPhone());
	}

	@Test
	@DisplayName("Record 2752: Fax is 330-836-2302")
	void FaxOfRecord2752() {
		assertEquals("330-836-2302", customers.get(2751).getFax());
	}

	@Test
	@DisplayName("Record 2752: Email is marcia@maruyama.com")
	void EmailOfRecord2752() {
		assertEquals("marcia@maruyama.com", customers.get(2751).getEmail());
	}

	@Test
	@DisplayName("Record 2752: Web is http://www.marciamaruyama.com")
	void WebOfRecord2752() {
		assertEquals("http://www.marciamaruyama.com", customers.get(2751).getWeb());
	}
}
