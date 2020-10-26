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
class Record_1399 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1399: FirstName is Brett")
	void FirstNameOfRecord1399() {
		assertEquals("Brett", customers.get(1398).getFirstName());
	}

	@Test
	@DisplayName("Record 1399: LastName is Midgette")
	void LastNameOfRecord1399() {
		assertEquals("Midgette", customers.get(1398).getLastName());
	}

	@Test
	@DisplayName("Record 1399: Company is Ohio Screw Products Inc")
	void CompanyOfRecord1399() {
		assertEquals("Ohio Screw Products Inc", customers.get(1398).getCompany());
	}

	@Test
	@DisplayName("Record 1399: Address is 9265 Activity Rd  #-108")
	void AddressOfRecord1399() {
		assertEquals("9265 Activity Rd  #-108", customers.get(1398).getAddress());
	}

	@Test
	@DisplayName("Record 1399: City is San Diego")
	void CityOfRecord1399() {
		assertEquals("San Diego", customers.get(1398).getCity());
	}

	@Test
	@DisplayName("Record 1399: County is San Diego")
	void CountyOfRecord1399() {
		assertEquals("San Diego", customers.get(1398).getCounty());
	}

	@Test
	@DisplayName("Record 1399: State is CA")
	void StateOfRecord1399() {
		assertEquals("CA", customers.get(1398).getState());
	}

	@Test
	@DisplayName("Record 1399: ZIP is 92126")
	void ZIPOfRecord1399() {
		assertEquals("92126", customers.get(1398).getZIP());
	}

	@Test
	@DisplayName("Record 1399: Phone is 858-271-3528")
	void PhoneOfRecord1399() {
		assertEquals("858-271-3528", customers.get(1398).getPhone());
	}

	@Test
	@DisplayName("Record 1399: Fax is 858-271-1985")
	void FaxOfRecord1399() {
		assertEquals("858-271-1985", customers.get(1398).getFax());
	}

	@Test
	@DisplayName("Record 1399: Email is brett@midgette.com")
	void EmailOfRecord1399() {
		assertEquals("brett@midgette.com", customers.get(1398).getEmail());
	}

	@Test
	@DisplayName("Record 1399: Web is http://www.brettmidgette.com")
	void WebOfRecord1399() {
		assertEquals("http://www.brettmidgette.com", customers.get(1398).getWeb());
	}
}
