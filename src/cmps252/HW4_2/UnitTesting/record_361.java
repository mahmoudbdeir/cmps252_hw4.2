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

@Tag("16")
class Record_361 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 361: FirstName is Chad")
	void FirstNameOfRecord361() {
		assertEquals("Chad", customers.get(360).getFirstName());
	}

	@Test
	@DisplayName("Record 361: LastName is Niffenegger")
	void LastNameOfRecord361() {
		assertEquals("Niffenegger", customers.get(360).getLastName());
	}

	@Test
	@DisplayName("Record 361: Company is Lenzner, Terry F Esq")
	void CompanyOfRecord361() {
		assertEquals("Lenzner, Terry F Esq", customers.get(360).getCompany());
	}

	@Test
	@DisplayName("Record 361: Address is 110 Crain Hwy S")
	void AddressOfRecord361() {
		assertEquals("110 Crain Hwy S", customers.get(360).getAddress());
	}

	@Test
	@DisplayName("Record 361: City is Glen Burnie")
	void CityOfRecord361() {
		assertEquals("Glen Burnie", customers.get(360).getCity());
	}

	@Test
	@DisplayName("Record 361: County is Anne Arundel")
	void CountyOfRecord361() {
		assertEquals("Anne Arundel", customers.get(360).getCounty());
	}

	@Test
	@DisplayName("Record 361: State is MD")
	void StateOfRecord361() {
		assertEquals("MD", customers.get(360).getState());
	}

	@Test
	@DisplayName("Record 361: ZIP is 21061")
	void ZIPOfRecord361() {
		assertEquals("21061", customers.get(360).getZIP());
	}

	@Test
	@DisplayName("Record 361: Phone is 410-553-5554")
	void PhoneOfRecord361() {
		assertEquals("410-553-5554", customers.get(360).getPhone());
	}

	@Test
	@DisplayName("Record 361: Fax is 410-553-9482")
	void FaxOfRecord361() {
		assertEquals("410-553-9482", customers.get(360).getFax());
	}

	@Test
	@DisplayName("Record 361: Email is chad@niffenegger.com")
	void EmailOfRecord361() {
		assertEquals("chad@niffenegger.com", customers.get(360).getEmail());
	}

	@Test
	@DisplayName("Record 361: Web is http://www.chadniffenegger.com")
	void WebOfRecord361() {
		assertEquals("http://www.chadniffenegger.com", customers.get(360).getWeb());
	}
}
