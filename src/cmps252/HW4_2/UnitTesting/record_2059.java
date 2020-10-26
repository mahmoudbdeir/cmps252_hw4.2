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

@Tag("23")
class Record_2059 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2059: FirstName is Don")
	void FirstNameOfRecord2059() {
		assertEquals("Don", customers.get(2058).getFirstName());
	}

	@Test
	@DisplayName("Record 2059: LastName is Sasseen")
	void LastNameOfRecord2059() {
		assertEquals("Sasseen", customers.get(2058).getLastName());
	}

	@Test
	@DisplayName("Record 2059: Company is Rosa Bennett Enterprises Inc")
	void CompanyOfRecord2059() {
		assertEquals("Rosa Bennett Enterprises Inc", customers.get(2058).getCompany());
	}

	@Test
	@DisplayName("Record 2059: Address is 3983 S Mccarran Blvd  #-445")
	void AddressOfRecord2059() {
		assertEquals("3983 S Mccarran Blvd  #-445", customers.get(2058).getAddress());
	}

	@Test
	@DisplayName("Record 2059: City is Reno")
	void CityOfRecord2059() {
		assertEquals("Reno", customers.get(2058).getCity());
	}

	@Test
	@DisplayName("Record 2059: County is Washoe")
	void CountyOfRecord2059() {
		assertEquals("Washoe", customers.get(2058).getCounty());
	}

	@Test
	@DisplayName("Record 2059: State is NV")
	void StateOfRecord2059() {
		assertEquals("NV", customers.get(2058).getState());
	}

	@Test
	@DisplayName("Record 2059: ZIP is 89502")
	void ZIPOfRecord2059() {
		assertEquals("89502", customers.get(2058).getZIP());
	}

	@Test
	@DisplayName("Record 2059: Phone is 775-825-3460")
	void PhoneOfRecord2059() {
		assertEquals("775-825-3460", customers.get(2058).getPhone());
	}

	@Test
	@DisplayName("Record 2059: Fax is 775-825-3219")
	void FaxOfRecord2059() {
		assertEquals("775-825-3219", customers.get(2058).getFax());
	}

	@Test
	@DisplayName("Record 2059: Email is don@sasseen.com")
	void EmailOfRecord2059() {
		assertEquals("don@sasseen.com", customers.get(2058).getEmail());
	}

	@Test
	@DisplayName("Record 2059: Web is http://www.donsasseen.com")
	void WebOfRecord2059() {
		assertEquals("http://www.donsasseen.com", customers.get(2058).getWeb());
	}
}
