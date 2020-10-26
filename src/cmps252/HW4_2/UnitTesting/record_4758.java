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

@Tag("22")
class Record_4758 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4758: FirstName is Maxwell")
	void FirstNameOfRecord4758() {
		assertEquals("Maxwell", customers.get(4757).getFirstName());
	}

	@Test
	@DisplayName("Record 4758: LastName is Arnott")
	void LastNameOfRecord4758() {
		assertEquals("Arnott", customers.get(4757).getLastName());
	}

	@Test
	@DisplayName("Record 4758: Company is Century 21 Real Estate  100")
	void CompanyOfRecord4758() {
		assertEquals("Century 21 Real Estate  100", customers.get(4757).getCompany());
	}

	@Test
	@DisplayName("Record 4758: Address is 610 N Alma School Rd  #-44")
	void AddressOfRecord4758() {
		assertEquals("610 N Alma School Rd  #-44", customers.get(4757).getAddress());
	}

	@Test
	@DisplayName("Record 4758: City is Chandler")
	void CityOfRecord4758() {
		assertEquals("Chandler", customers.get(4757).getCity());
	}

	@Test
	@DisplayName("Record 4758: County is Maricopa")
	void CountyOfRecord4758() {
		assertEquals("Maricopa", customers.get(4757).getCounty());
	}

	@Test
	@DisplayName("Record 4758: State is AZ")
	void StateOfRecord4758() {
		assertEquals("AZ", customers.get(4757).getState());
	}

	@Test
	@DisplayName("Record 4758: ZIP is 85224")
	void ZIPOfRecord4758() {
		assertEquals("85224", customers.get(4757).getZIP());
	}

	@Test
	@DisplayName("Record 4758: Phone is 480-899-7998")
	void PhoneOfRecord4758() {
		assertEquals("480-899-7998", customers.get(4757).getPhone());
	}

	@Test
	@DisplayName("Record 4758: Fax is 480-899-4082")
	void FaxOfRecord4758() {
		assertEquals("480-899-4082", customers.get(4757).getFax());
	}

	@Test
	@DisplayName("Record 4758: Email is maxwell@arnott.com")
	void EmailOfRecord4758() {
		assertEquals("maxwell@arnott.com", customers.get(4757).getEmail());
	}

	@Test
	@DisplayName("Record 4758: Web is http://www.maxwellarnott.com")
	void WebOfRecord4758() {
		assertEquals("http://www.maxwellarnott.com", customers.get(4757).getWeb());
	}
}
