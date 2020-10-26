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

@Tag("19")
class Record_112 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 112: FirstName is Rena")
	void FirstNameOfRecord112() {
		assertEquals("Rena", customers.get(111).getFirstName());
	}

	@Test
	@DisplayName("Record 112: LastName is Rushen")
	void LastNameOfRecord112() {
		assertEquals("Rushen", customers.get(111).getLastName());
	}

	@Test
	@DisplayName("Record 112: Company is Imperial Inn")
	void CompanyOfRecord112() {
		assertEquals("Imperial Inn", customers.get(111).getCompany());
	}

	@Test
	@DisplayName("Record 112: Address is 15308 Spencerville Ct  #-201b")
	void AddressOfRecord112() {
		assertEquals("15308 Spencerville Ct  #-201b", customers.get(111).getAddress());
	}

	@Test
	@DisplayName("Record 112: City is Burtonsville")
	void CityOfRecord112() {
		assertEquals("Burtonsville", customers.get(111).getCity());
	}

	@Test
	@DisplayName("Record 112: County is Montgomery")
	void CountyOfRecord112() {
		assertEquals("Montgomery", customers.get(111).getCounty());
	}

	@Test
	@DisplayName("Record 112: State is MD")
	void StateOfRecord112() {
		assertEquals("MD", customers.get(111).getState());
	}

	@Test
	@DisplayName("Record 112: ZIP is 20866")
	void ZIPOfRecord112() {
		assertEquals("20866", customers.get(111).getZIP());
	}

	@Test
	@DisplayName("Record 112: Phone is 301-989-9174")
	void PhoneOfRecord112() {
		assertEquals("301-989-9174", customers.get(111).getPhone());
	}

	@Test
	@DisplayName("Record 112: Fax is 301-989-1688")
	void FaxOfRecord112() {
		assertEquals("301-989-1688", customers.get(111).getFax());
	}

	@Test
	@DisplayName("Record 112: Email is rena@rushen.com")
	void EmailOfRecord112() {
		assertEquals("rena@rushen.com", customers.get(111).getEmail());
	}

	@Test
	@DisplayName("Record 112: Web is http://www.renarushen.com")
	void WebOfRecord112() {
		assertEquals("http://www.renarushen.com", customers.get(111).getWeb());
	}
}
