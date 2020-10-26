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
class Record_2626 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2626: FirstName is Dwight")
	void FirstNameOfRecord2626() {
		assertEquals("Dwight", customers.get(2625).getFirstName());
	}

	@Test
	@DisplayName("Record 2626: LastName is Remenaric")
	void LastNameOfRecord2626() {
		assertEquals("Remenaric", customers.get(2625).getLastName());
	}

	@Test
	@DisplayName("Record 2626: Company is Coates, Mary Ann")
	void CompanyOfRecord2626() {
		assertEquals("Coates, Mary Ann", customers.get(2625).getCompany());
	}

	@Test
	@DisplayName("Record 2626: Address is 201 N Main St")
	void AddressOfRecord2626() {
		assertEquals("201 N Main St", customers.get(2625).getAddress());
	}

	@Test
	@DisplayName("Record 2626: City is Bluffton")
	void CityOfRecord2626() {
		assertEquals("Bluffton", customers.get(2625).getCity());
	}

	@Test
	@DisplayName("Record 2626: County is Allen")
	void CountyOfRecord2626() {
		assertEquals("Allen", customers.get(2625).getCounty());
	}

	@Test
	@DisplayName("Record 2626: State is OH")
	void StateOfRecord2626() {
		assertEquals("OH", customers.get(2625).getState());
	}

	@Test
	@DisplayName("Record 2626: ZIP is 45817")
	void ZIPOfRecord2626() {
		assertEquals("45817", customers.get(2625).getZIP());
	}

	@Test
	@DisplayName("Record 2626: Phone is 419-358-0096")
	void PhoneOfRecord2626() {
		assertEquals("419-358-0096", customers.get(2625).getPhone());
	}

	@Test
	@DisplayName("Record 2626: Fax is 419-358-0029")
	void FaxOfRecord2626() {
		assertEquals("419-358-0029", customers.get(2625).getFax());
	}

	@Test
	@DisplayName("Record 2626: Email is dwight@remenaric.com")
	void EmailOfRecord2626() {
		assertEquals("dwight@remenaric.com", customers.get(2625).getEmail());
	}

	@Test
	@DisplayName("Record 2626: Web is http://www.dwightremenaric.com")
	void WebOfRecord2626() {
		assertEquals("http://www.dwightremenaric.com", customers.get(2625).getWeb());
	}
}
