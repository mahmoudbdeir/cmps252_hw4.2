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

@Tag("31")
class Record_4234 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4234: FirstName is Charlie")
	void FirstNameOfRecord4234() {
		assertEquals("Charlie", customers.get(4233).getFirstName());
	}

	@Test
	@DisplayName("Record 4234: LastName is Larousse")
	void LastNameOfRecord4234() {
		assertEquals("Larousse", customers.get(4233).getLastName());
	}

	@Test
	@DisplayName("Record 4234: Company is Independent Travel Service")
	void CompanyOfRecord4234() {
		assertEquals("Independent Travel Service", customers.get(4233).getCompany());
	}

	@Test
	@DisplayName("Record 4234: Address is 510 Goodman St N")
	void AddressOfRecord4234() {
		assertEquals("510 Goodman St N", customers.get(4233).getAddress());
	}

	@Test
	@DisplayName("Record 4234: City is Rochester")
	void CityOfRecord4234() {
		assertEquals("Rochester", customers.get(4233).getCity());
	}

	@Test
	@DisplayName("Record 4234: County is Monroe")
	void CountyOfRecord4234() {
		assertEquals("Monroe", customers.get(4233).getCounty());
	}

	@Test
	@DisplayName("Record 4234: State is NY")
	void StateOfRecord4234() {
		assertEquals("NY", customers.get(4233).getState());
	}

	@Test
	@DisplayName("Record 4234: ZIP is 14609")
	void ZIPOfRecord4234() {
		assertEquals("14609", customers.get(4233).getZIP());
	}

	@Test
	@DisplayName("Record 4234: Phone is 585-288-1952")
	void PhoneOfRecord4234() {
		assertEquals("585-288-1952", customers.get(4233).getPhone());
	}

	@Test
	@DisplayName("Record 4234: Fax is 585-288-6217")
	void FaxOfRecord4234() {
		assertEquals("585-288-6217", customers.get(4233).getFax());
	}

	@Test
	@DisplayName("Record 4234: Email is charlie@larousse.com")
	void EmailOfRecord4234() {
		assertEquals("charlie@larousse.com", customers.get(4233).getEmail());
	}

	@Test
	@DisplayName("Record 4234: Web is http://www.charlielarousse.com")
	void WebOfRecord4234() {
		assertEquals("http://www.charlielarousse.com", customers.get(4233).getWeb());
	}
}
