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

@Tag("2")
class Record_4250 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4250: FirstName is Christal")
	void FirstNameOfRecord4250() {
		assertEquals("Christal", customers.get(4249).getFirstName());
	}

	@Test
	@DisplayName("Record 4250: LastName is Kuhls")
	void LastNameOfRecord4250() {
		assertEquals("Kuhls", customers.get(4249).getLastName());
	}

	@Test
	@DisplayName("Record 4250: Company is Lincoln County Manufacturing")
	void CompanyOfRecord4250() {
		assertEquals("Lincoln County Manufacturing", customers.get(4249).getCompany());
	}

	@Test
	@DisplayName("Record 4250: Address is 7340 Parklane Rd  #-203")
	void AddressOfRecord4250() {
		assertEquals("7340 Parklane Rd  #-203", customers.get(4249).getAddress());
	}

	@Test
	@DisplayName("Record 4250: City is Columbia")
	void CityOfRecord4250() {
		assertEquals("Columbia", customers.get(4249).getCity());
	}

	@Test
	@DisplayName("Record 4250: County is Richland")
	void CountyOfRecord4250() {
		assertEquals("Richland", customers.get(4249).getCounty());
	}

	@Test
	@DisplayName("Record 4250: State is SC")
	void StateOfRecord4250() {
		assertEquals("SC", customers.get(4249).getState());
	}

	@Test
	@DisplayName("Record 4250: ZIP is 29223")
	void ZIPOfRecord4250() {
		assertEquals("29223", customers.get(4249).getZIP());
	}

	@Test
	@DisplayName("Record 4250: Phone is 803-699-1254")
	void PhoneOfRecord4250() {
		assertEquals("803-699-1254", customers.get(4249).getPhone());
	}

	@Test
	@DisplayName("Record 4250: Fax is 803-699-3012")
	void FaxOfRecord4250() {
		assertEquals("803-699-3012", customers.get(4249).getFax());
	}

	@Test
	@DisplayName("Record 4250: Email is christal@kuhls.com")
	void EmailOfRecord4250() {
		assertEquals("christal@kuhls.com", customers.get(4249).getEmail());
	}

	@Test
	@DisplayName("Record 4250: Web is http://www.christalkuhls.com")
	void WebOfRecord4250() {
		assertEquals("http://www.christalkuhls.com", customers.get(4249).getWeb());
	}
}
