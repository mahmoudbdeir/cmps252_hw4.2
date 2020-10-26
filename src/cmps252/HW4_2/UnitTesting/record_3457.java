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

@Tag("15")
class Record_3457 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3457: FirstName is Rowena")
	void FirstNameOfRecord3457() {
		assertEquals("Rowena", customers.get(3456).getFirstName());
	}

	@Test
	@DisplayName("Record 3457: LastName is Lawler")
	void LastNameOfRecord3457() {
		assertEquals("Lawler", customers.get(3456).getLastName());
	}

	@Test
	@DisplayName("Record 3457: Company is Churchill, David J Esq")
	void CompanyOfRecord3457() {
		assertEquals("Churchill, David J Esq", customers.get(3456).getCompany());
	}

	@Test
	@DisplayName("Record 3457: Address is 4703 Webster St")
	void AddressOfRecord3457() {
		assertEquals("4703 Webster St", customers.get(3456).getAddress());
	}

	@Test
	@DisplayName("Record 3457: City is Bladensburg")
	void CityOfRecord3457() {
		assertEquals("Bladensburg", customers.get(3456).getCity());
	}

	@Test
	@DisplayName("Record 3457: County is Prince Georges")
	void CountyOfRecord3457() {
		assertEquals("Prince Georges", customers.get(3456).getCounty());
	}

	@Test
	@DisplayName("Record 3457: State is MD")
	void StateOfRecord3457() {
		assertEquals("MD", customers.get(3456).getState());
	}

	@Test
	@DisplayName("Record 3457: ZIP is 20710")
	void ZIPOfRecord3457() {
		assertEquals("20710", customers.get(3456).getZIP());
	}

	@Test
	@DisplayName("Record 3457: Phone is 301-985-7892")
	void PhoneOfRecord3457() {
		assertEquals("301-985-7892", customers.get(3456).getPhone());
	}

	@Test
	@DisplayName("Record 3457: Fax is 301-985-8753")
	void FaxOfRecord3457() {
		assertEquals("301-985-8753", customers.get(3456).getFax());
	}

	@Test
	@DisplayName("Record 3457: Email is rowena@lawler.com")
	void EmailOfRecord3457() {
		assertEquals("rowena@lawler.com", customers.get(3456).getEmail());
	}

	@Test
	@DisplayName("Record 3457: Web is http://www.rowenalawler.com")
	void WebOfRecord3457() {
		assertEquals("http://www.rowenalawler.com", customers.get(3456).getWeb());
	}
}
