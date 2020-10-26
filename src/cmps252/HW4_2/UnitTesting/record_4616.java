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

@Tag("26")
class Record_4616 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4616: FirstName is Teodoro")
	void FirstNameOfRecord4616() {
		assertEquals("Teodoro", customers.get(4615).getFirstName());
	}

	@Test
	@DisplayName("Record 4616: LastName is Willette")
	void LastNameOfRecord4616() {
		assertEquals("Willette", customers.get(4615).getLastName());
	}

	@Test
	@DisplayName("Record 4616: Company is Crain Langner & Co")
	void CompanyOfRecord4616() {
		assertEquals("Crain Langner & Co", customers.get(4615).getCompany());
	}

	@Test
	@DisplayName("Record 4616: Address is 2121 N Weber St")
	void AddressOfRecord4616() {
		assertEquals("2121 N Weber St", customers.get(4615).getAddress());
	}

	@Test
	@DisplayName("Record 4616: City is Colorado Springs")
	void CityOfRecord4616() {
		assertEquals("Colorado Springs", customers.get(4615).getCity());
	}

	@Test
	@DisplayName("Record 4616: County is El Paso")
	void CountyOfRecord4616() {
		assertEquals("El Paso", customers.get(4615).getCounty());
	}

	@Test
	@DisplayName("Record 4616: State is CO")
	void StateOfRecord4616() {
		assertEquals("CO", customers.get(4615).getState());
	}

	@Test
	@DisplayName("Record 4616: ZIP is 80907")
	void ZIPOfRecord4616() {
		assertEquals("80907", customers.get(4615).getZIP());
	}

	@Test
	@DisplayName("Record 4616: Phone is 719-636-1119")
	void PhoneOfRecord4616() {
		assertEquals("719-636-1119", customers.get(4615).getPhone());
	}

	@Test
	@DisplayName("Record 4616: Fax is 719-636-6186")
	void FaxOfRecord4616() {
		assertEquals("719-636-6186", customers.get(4615).getFax());
	}

	@Test
	@DisplayName("Record 4616: Email is teodoro@willette.com")
	void EmailOfRecord4616() {
		assertEquals("teodoro@willette.com", customers.get(4615).getEmail());
	}

	@Test
	@DisplayName("Record 4616: Web is http://www.teodorowillette.com")
	void WebOfRecord4616() {
		assertEquals("http://www.teodorowillette.com", customers.get(4615).getWeb());
	}
}
