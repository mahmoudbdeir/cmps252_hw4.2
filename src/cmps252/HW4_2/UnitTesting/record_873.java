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

@Tag("40")
class Record_873 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 873: FirstName is Lakesha")
	void FirstNameOfRecord873() {
		assertEquals("Lakesha", customers.get(872).getFirstName());
	}

	@Test
	@DisplayName("Record 873: LastName is Kirsopp")
	void LastNameOfRecord873() {
		assertEquals("Kirsopp", customers.get(872).getLastName());
	}

	@Test
	@DisplayName("Record 873: Company is Corwin, David S Esq")
	void CompanyOfRecord873() {
		assertEquals("Corwin, David S Esq", customers.get(872).getCompany());
	}

	@Test
	@DisplayName("Record 873: Address is 1045 N Main St")
	void AddressOfRecord873() {
		assertEquals("1045 N Main St", customers.get(872).getAddress());
	}

	@Test
	@DisplayName("Record 873: City is Bowling Green")
	void CityOfRecord873() {
		assertEquals("Bowling Green", customers.get(872).getCity());
	}

	@Test
	@DisplayName("Record 873: County is Wood")
	void CountyOfRecord873() {
		assertEquals("Wood", customers.get(872).getCounty());
	}

	@Test
	@DisplayName("Record 873: State is OH")
	void StateOfRecord873() {
		assertEquals("OH", customers.get(872).getState());
	}

	@Test
	@DisplayName("Record 873: ZIP is 43402")
	void ZIPOfRecord873() {
		assertEquals("43402", customers.get(872).getZIP());
	}

	@Test
	@DisplayName("Record 873: Phone is 419-352-1211")
	void PhoneOfRecord873() {
		assertEquals("419-352-1211", customers.get(872).getPhone());
	}

	@Test
	@DisplayName("Record 873: Fax is 419-352-4599")
	void FaxOfRecord873() {
		assertEquals("419-352-4599", customers.get(872).getFax());
	}

	@Test
	@DisplayName("Record 873: Email is lakesha@kirsopp.com")
	void EmailOfRecord873() {
		assertEquals("lakesha@kirsopp.com", customers.get(872).getEmail());
	}

	@Test
	@DisplayName("Record 873: Web is http://www.lakeshakirsopp.com")
	void WebOfRecord873() {
		assertEquals("http://www.lakeshakirsopp.com", customers.get(872).getWeb());
	}
}
