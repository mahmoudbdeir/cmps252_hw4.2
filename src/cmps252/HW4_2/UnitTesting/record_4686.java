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
class Record_4686 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4686: FirstName is Terrie")
	void FirstNameOfRecord4686() {
		assertEquals("Terrie", customers.get(4685).getFirstName());
	}

	@Test
	@DisplayName("Record 4686: LastName is Frese")
	void LastNameOfRecord4686() {
		assertEquals("Frese", customers.get(4685).getLastName());
	}

	@Test
	@DisplayName("Record 4686: Company is Lawrence A Heller Assocs")
	void CompanyOfRecord4686() {
		assertEquals("Lawrence A Heller Assocs", customers.get(4685).getCompany());
	}

	@Test
	@DisplayName("Record 4686: Address is 16200 Ventura Blvd  #-400g")
	void AddressOfRecord4686() {
		assertEquals("16200 Ventura Blvd  #-400g", customers.get(4685).getAddress());
	}

	@Test
	@DisplayName("Record 4686: City is Encino")
	void CityOfRecord4686() {
		assertEquals("Encino", customers.get(4685).getCity());
	}

	@Test
	@DisplayName("Record 4686: County is Los Angeles")
	void CountyOfRecord4686() {
		assertEquals("Los Angeles", customers.get(4685).getCounty());
	}

	@Test
	@DisplayName("Record 4686: State is CA")
	void StateOfRecord4686() {
		assertEquals("CA", customers.get(4685).getState());
	}

	@Test
	@DisplayName("Record 4686: ZIP is 91436")
	void ZIPOfRecord4686() {
		assertEquals("91436", customers.get(4685).getZIP());
	}

	@Test
	@DisplayName("Record 4686: Phone is 818-784-6606")
	void PhoneOfRecord4686() {
		assertEquals("818-784-6606", customers.get(4685).getPhone());
	}

	@Test
	@DisplayName("Record 4686: Fax is 818-784-3461")
	void FaxOfRecord4686() {
		assertEquals("818-784-3461", customers.get(4685).getFax());
	}

	@Test
	@DisplayName("Record 4686: Email is terrie@frese.com")
	void EmailOfRecord4686() {
		assertEquals("terrie@frese.com", customers.get(4685).getEmail());
	}

	@Test
	@DisplayName("Record 4686: Web is http://www.terriefrese.com")
	void WebOfRecord4686() {
		assertEquals("http://www.terriefrese.com", customers.get(4685).getWeb());
	}
}
