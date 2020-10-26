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

@Tag("46")
class Record_4948 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4948: FirstName is Dominique")
	void FirstNameOfRecord4948() {
		assertEquals("Dominique", customers.get(4947).getFirstName());
	}

	@Test
	@DisplayName("Record 4948: LastName is Sumatskuku")
	void LastNameOfRecord4948() {
		assertEquals("Sumatskuku", customers.get(4947).getLastName());
	}

	@Test
	@DisplayName("Record 4948: Company is Menn, Geraldine M Esq")
	void CompanyOfRecord4948() {
		assertEquals("Menn, Geraldine M Esq", customers.get(4947).getCompany());
	}

	@Test
	@DisplayName("Record 4948: Address is 200 Salina Meadows Pky")
	void AddressOfRecord4948() {
		assertEquals("200 Salina Meadows Pky", customers.get(4947).getAddress());
	}

	@Test
	@DisplayName("Record 4948: City is Syracuse")
	void CityOfRecord4948() {
		assertEquals("Syracuse", customers.get(4947).getCity());
	}

	@Test
	@DisplayName("Record 4948: County is Onondaga")
	void CountyOfRecord4948() {
		assertEquals("Onondaga", customers.get(4947).getCounty());
	}

	@Test
	@DisplayName("Record 4948: State is NY")
	void StateOfRecord4948() {
		assertEquals("NY", customers.get(4947).getState());
	}

	@Test
	@DisplayName("Record 4948: ZIP is 13212")
	void ZIPOfRecord4948() {
		assertEquals("13212", customers.get(4947).getZIP());
	}

	@Test
	@DisplayName("Record 4948: Phone is 315-457-3944")
	void PhoneOfRecord4948() {
		assertEquals("315-457-3944", customers.get(4947).getPhone());
	}

	@Test
	@DisplayName("Record 4948: Fax is 315-457-6604")
	void FaxOfRecord4948() {
		assertEquals("315-457-6604", customers.get(4947).getFax());
	}

	@Test
	@DisplayName("Record 4948: Email is dominique@sumatskuku.com")
	void EmailOfRecord4948() {
		assertEquals("dominique@sumatskuku.com", customers.get(4947).getEmail());
	}

	@Test
	@DisplayName("Record 4948: Web is http://www.dominiquesumatskuku.com")
	void WebOfRecord4948() {
		assertEquals("http://www.dominiquesumatskuku.com", customers.get(4947).getWeb());
	}
}
