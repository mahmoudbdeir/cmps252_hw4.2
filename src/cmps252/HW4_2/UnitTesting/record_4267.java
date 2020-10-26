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
class Record_4267 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4267: FirstName is Porter")
	void FirstNameOfRecord4267() {
		assertEquals("Porter", customers.get(4266).getFirstName());
	}

	@Test
	@DisplayName("Record 4267: LastName is Byrum")
	void LastNameOfRecord4267() {
		assertEquals("Byrum", customers.get(4266).getLastName());
	}

	@Test
	@DisplayName("Record 4267: Company is Embassy Suites Hotel")
	void CompanyOfRecord4267() {
		assertEquals("Embassy Suites Hotel", customers.get(4266).getCompany());
	}

	@Test
	@DisplayName("Record 4267: Address is 10001 Lile Dr")
	void AddressOfRecord4267() {
		assertEquals("10001 Lile Dr", customers.get(4266).getAddress());
	}

	@Test
	@DisplayName("Record 4267: City is Little Rock")
	void CityOfRecord4267() {
		assertEquals("Little Rock", customers.get(4266).getCity());
	}

	@Test
	@DisplayName("Record 4267: County is Pulaski")
	void CountyOfRecord4267() {
		assertEquals("Pulaski", customers.get(4266).getCounty());
	}

	@Test
	@DisplayName("Record 4267: State is AR")
	void StateOfRecord4267() {
		assertEquals("AR", customers.get(4266).getState());
	}

	@Test
	@DisplayName("Record 4267: ZIP is 72205")
	void ZIPOfRecord4267() {
		assertEquals("72205", customers.get(4266).getZIP());
	}

	@Test
	@DisplayName("Record 4267: Phone is 501-221-4348")
	void PhoneOfRecord4267() {
		assertEquals("501-221-4348", customers.get(4266).getPhone());
	}

	@Test
	@DisplayName("Record 4267: Fax is 501-221-4568")
	void FaxOfRecord4267() {
		assertEquals("501-221-4568", customers.get(4266).getFax());
	}

	@Test
	@DisplayName("Record 4267: Email is porter@byrum.com")
	void EmailOfRecord4267() {
		assertEquals("porter@byrum.com", customers.get(4266).getEmail());
	}

	@Test
	@DisplayName("Record 4267: Web is http://www.porterbyrum.com")
	void WebOfRecord4267() {
		assertEquals("http://www.porterbyrum.com", customers.get(4266).getWeb());
	}
}
