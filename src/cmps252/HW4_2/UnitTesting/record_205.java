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

@Tag("21")
class Record_205 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 205: FirstName is Pablo")
	void FirstNameOfRecord205() {
		assertEquals("Pablo", customers.get(204).getFirstName());
	}

	@Test
	@DisplayName("Record 205: LastName is Pikula")
	void LastNameOfRecord205() {
		assertEquals("Pikula", customers.get(204).getLastName());
	}

	@Test
	@DisplayName("Record 205: Company is Cstm Ppr Groups Rochester Mill")
	void CompanyOfRecord205() {
		assertEquals("Cstm Ppr Groups Rochester Mill", customers.get(204).getCompany());
	}

	@Test
	@DisplayName("Record 205: Address is 8869 Greenwood Pl")
	void AddressOfRecord205() {
		assertEquals("8869 Greenwood Pl", customers.get(204).getAddress());
	}

	@Test
	@DisplayName("Record 205: City is Savage")
	void CityOfRecord205() {
		assertEquals("Savage", customers.get(204).getCity());
	}

	@Test
	@DisplayName("Record 205: County is Howard")
	void CountyOfRecord205() {
		assertEquals("Howard", customers.get(204).getCounty());
	}

	@Test
	@DisplayName("Record 205: State is MD")
	void StateOfRecord205() {
		assertEquals("MD", customers.get(204).getState());
	}

	@Test
	@DisplayName("Record 205: ZIP is 20763")
	void ZIPOfRecord205() {
		assertEquals("20763", customers.get(204).getZIP());
	}

	@Test
	@DisplayName("Record 205: Phone is 410-792-9430")
	void PhoneOfRecord205() {
		assertEquals("410-792-9430", customers.get(204).getPhone());
	}

	@Test
	@DisplayName("Record 205: Fax is 410-792-1086")
	void FaxOfRecord205() {
		assertEquals("410-792-1086", customers.get(204).getFax());
	}

	@Test
	@DisplayName("Record 205: Email is pablo@pikula.com")
	void EmailOfRecord205() {
		assertEquals("pablo@pikula.com", customers.get(204).getEmail());
	}

	@Test
	@DisplayName("Record 205: Web is http://www.pablopikula.com")
	void WebOfRecord205() {
		assertEquals("http://www.pablopikula.com", customers.get(204).getWeb());
	}
}
