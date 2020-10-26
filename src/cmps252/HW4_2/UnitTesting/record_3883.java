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

@Tag("20")
class Record_3883 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3883: FirstName is Fatima")
	void FirstNameOfRecord3883() {
		assertEquals("Fatima", customers.get(3882).getFirstName());
	}

	@Test
	@DisplayName("Record 3883: LastName is Turrentine")
	void LastNameOfRecord3883() {
		assertEquals("Turrentine", customers.get(3882).getLastName());
	}

	@Test
	@DisplayName("Record 3883: Company is Hexagram Inc")
	void CompanyOfRecord3883() {
		assertEquals("Hexagram Inc", customers.get(3882).getCompany());
	}

	@Test
	@DisplayName("Record 3883: Address is 703 Packerland Dr")
	void AddressOfRecord3883() {
		assertEquals("703 Packerland Dr", customers.get(3882).getAddress());
	}

	@Test
	@DisplayName("Record 3883: City is Green Bay")
	void CityOfRecord3883() {
		assertEquals("Green Bay", customers.get(3882).getCity());
	}

	@Test
	@DisplayName("Record 3883: County is Brown")
	void CountyOfRecord3883() {
		assertEquals("Brown", customers.get(3882).getCounty());
	}

	@Test
	@DisplayName("Record 3883: State is WI")
	void StateOfRecord3883() {
		assertEquals("WI", customers.get(3882).getState());
	}

	@Test
	@DisplayName("Record 3883: ZIP is 54303")
	void ZIPOfRecord3883() {
		assertEquals("54303", customers.get(3882).getZIP());
	}

	@Test
	@DisplayName("Record 3883: Phone is 920-499-4741")
	void PhoneOfRecord3883() {
		assertEquals("920-499-4741", customers.get(3882).getPhone());
	}

	@Test
	@DisplayName("Record 3883: Fax is 920-499-4141")
	void FaxOfRecord3883() {
		assertEquals("920-499-4141", customers.get(3882).getFax());
	}

	@Test
	@DisplayName("Record 3883: Email is fatima@turrentine.com")
	void EmailOfRecord3883() {
		assertEquals("fatima@turrentine.com", customers.get(3882).getEmail());
	}

	@Test
	@DisplayName("Record 3883: Web is http://www.fatimaturrentine.com")
	void WebOfRecord3883() {
		assertEquals("http://www.fatimaturrentine.com", customers.get(3882).getWeb());
	}
}
