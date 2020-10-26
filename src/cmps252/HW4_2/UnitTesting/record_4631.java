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

@Tag("0")
class Record_4631 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4631: FirstName is Amos")
	void FirstNameOfRecord4631() {
		assertEquals("Amos", customers.get(4630).getFirstName());
	}

	@Test
	@DisplayName("Record 4631: LastName is Wildner")
	void LastNameOfRecord4631() {
		assertEquals("Wildner", customers.get(4630).getLastName());
	}

	@Test
	@DisplayName("Record 4631: Company is Wainwright, Allan L Esq")
	void CompanyOfRecord4631() {
		assertEquals("Wainwright, Allan L Esq", customers.get(4630).getCompany());
	}

	@Test
	@DisplayName("Record 4631: Address is Main")
	void AddressOfRecord4631() {
		assertEquals("Main", customers.get(4630).getAddress());
	}

	@Test
	@DisplayName("Record 4631: City is Bar Harbor")
	void CityOfRecord4631() {
		assertEquals("Bar Harbor", customers.get(4630).getCity());
	}

	@Test
	@DisplayName("Record 4631: County is Hancock")
	void CountyOfRecord4631() {
		assertEquals("Hancock", customers.get(4630).getCounty());
	}

	@Test
	@DisplayName("Record 4631: State is ME")
	void StateOfRecord4631() {
		assertEquals("ME", customers.get(4630).getState());
	}

	@Test
	@DisplayName("Record 4631: ZIP is 4609")
	void ZIPOfRecord4631() {
		assertEquals("4609", customers.get(4630).getZIP());
	}

	@Test
	@DisplayName("Record 4631: Phone is 207-288-9691")
	void PhoneOfRecord4631() {
		assertEquals("207-288-9691", customers.get(4630).getPhone());
	}

	@Test
	@DisplayName("Record 4631: Fax is 207-288-6896")
	void FaxOfRecord4631() {
		assertEquals("207-288-6896", customers.get(4630).getFax());
	}

	@Test
	@DisplayName("Record 4631: Email is amos@wildner.com")
	void EmailOfRecord4631() {
		assertEquals("amos@wildner.com", customers.get(4630).getEmail());
	}

	@Test
	@DisplayName("Record 4631: Web is http://www.amoswildner.com")
	void WebOfRecord4631() {
		assertEquals("http://www.amoswildner.com", customers.get(4630).getWeb());
	}
}
